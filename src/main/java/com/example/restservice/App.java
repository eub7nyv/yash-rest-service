package com.example.restservice;

public class App {

	private String firstname;
	private String lastname;
	private String email;
	private String nickname;
	private String secret1;
	private String secret2;
	private String secret3;
	private String secret4;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public App(String firstname, String lastname, String email, String nickname, String secret1, String secret2,
			String secret3, String secret4) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.nickname = nickname;
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
		this.secret4 = secret4;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSecret1() {
		return secret1;
	}

	public void setSecret1(String secret1) {
		this.secret1 = secret1;
	}

	public String getSecret2() {
		return secret2;
	}

	public void setSecret2(String secret2) {
		this.secret2 = secret2;
	}

	public String getSecret3() {
		return secret3;
	}

	public void setSecret3(String secret3) {
		this.secret3 = secret3;
	}

	public String getSecret4() {
		return secret4;
	}

	public void setSecret4(String secret4) {
		this.secret4 = secret4;
	}

}
