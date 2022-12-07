package com.nagarro.controllers;


import java.security.Principal;

import com.nagarro.config.JwtUtils;
import com.nagarro.models.AuthenticationRequest;
import com.nagarro.models.AuthenticationResponse;
import com.nagarro.models.User;
import com.nagarro.servicesImpl.UserDetailsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AuthenticateController {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserDetailsServiceImpl detailsServiceImpl;

	@Autowired
	private JwtUtils jwtUtils;

	/**
	 * 
	 * @param AuthenticationRequest
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/generate-token")
	@CrossOrigin("*")
	public ResponseEntity<?> generateToken(@RequestBody AuthenticationRequest AuthenticationRequest) throws Exception {
		try {
			authenticate(AuthenticationRequest.getUserName(), AuthenticationRequest.getPassword());
		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("User not found");
		}
		UserDetails userDetails = this.detailsServiceImpl.loadUserByUsername(AuthenticationRequest.getUserName());
		System.out.println(userDetails);
		String s = this.jwtUtils.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(s));
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("User Disable");
		} catch (BadCredentialsException e) {
			throw new Exception("Bad Credentials!!");
		}
	}

	/**
	 * 
	 * @param principal
	 * @return
	 */
	@GetMapping("/current-user")
	@CrossOrigin("*")
	public User getCurrentUser(Principal principal) {
		System.out.println(principal.getName());
		return ((User) this.detailsServiceImpl.loadUserByUsername(principal.getName()));
	}

}

