package com.nagarro.servicesImpl;

import java.util.List;
import java.util.Set;

import com.nagarro.models.User;
import com.nagarro.models.UserRole;
import com.nagarro.repository.RoleRepo;
import com.nagarro.repository.UserRepo;
import com.nagarro.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepository;

	@Autowired
	private RoleRepo roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userRepository.getUserByEmail(user.getEmail());
		if (local != null) {
			System.out.println("User exists");
			throw new Exception("User already present!");
		} else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}

			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
			return local;
		}
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public User showUser(String email) {
		// TODO Auto-generated method stub
		return this.userRepository.getUserByEmail(email);
	}

	@Override
	public User fetchUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return this.userRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}
	
	

	

}
