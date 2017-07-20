package com.mrathena.spring.boot.start.entity;

public class SYSUser {

	private Long id;
	private String username;
	private String password;
	private String nickname;

	public Long getId() {
		return id;
	}
	public SYSUser withId(Long id) {
		this.setId(id);
		return this;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public SYSUser withUsername(String username) {
		this.setUsername(username);
		return this;
	}
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}
	public String getPassword() {
		return password;
	}
	public SYSUser withPassword(String password) {
		this.setPassword(password);
		return this;
	}
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
	public String getNickname() {
		return nickname;
	}
	public SYSUser withNickname(String nickname) {
		this.setNickname(nickname);
		return this;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "SYSUser [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname + "]";
	}
	
}