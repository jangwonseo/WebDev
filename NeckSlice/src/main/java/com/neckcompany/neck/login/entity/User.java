package com.neckcompany.neck.login.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USER", catalog = "NECKSLICE")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name="USER_ID")
	private Long id;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BIRTHDAY")
	private String birthday;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="GENDER")
	private Integer gender;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="CREATE_DATETIME")
	private LocalDateTime createDatetime;
	
	@Column(name="CREATE_USER")
	private String createUser;
	
	@Column(name="UPDATE_DATETIME")
	private LocalDateTime updateDatetime;
	
	@Column(name="UPDATE_USER")
	private String updateUser;
}
