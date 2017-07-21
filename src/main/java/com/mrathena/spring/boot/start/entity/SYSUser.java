package com.mrathena.spring.boot.start.entity;

/** sys_user */
public class SYSUser {

	/** sys_user.id */
	private Long id;
	/** sys_user.username */
	private String username;
	/** sys_user.password */
	private String password;
	/** sys_user.nickname */
	private String nickname;

	/** sys_user.id */
	public Long getId() {
		return id;
	}
	/** sys_user.id */
	public SYSUser withId(Long id) {
		this.setId(id);
		return this;
	}
	/** sys_user.id */
	public void setId(Long id) {
		this.id = id;
	}
	/** sys_user.username */
	public String getUsername() {
		return username;
	}
	/** sys_user.username */
	public SYSUser withUsername(String username) {
		this.setUsername(username);
		return this;
	}
	/** sys_user.username */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}
	/** sys_user.password */
	public String getPassword() {
		return password;
	}
	/** sys_user.password */
	public SYSUser withPassword(String password) {
		this.setPassword(password);
		return this;
	}
	/** sys_user.password */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
	/** sys_user.nickname */
	public String getNickname() {
		return nickname;
	}
	/** sys_user.nickname */
	public SYSUser withNickname(String nickname) {
		this.setNickname(nickname);
		return this;
	}
	/** sys_user.nickname */
	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	@Override
	public String toString() {
		return "SYSUser [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname + "]";
	}

}