package com.nagarro.models;

public class AuthenticationRequest {
	

		String userName;
		String password;
		
		public AuthenticationRequest() {
			super();
			//TODO Auto-generated constructor stub
		}
		
		public AuthenticationRequest(String userName, String password) {
			super();
			this.userName = userName;
			this.password = password;
		}
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
