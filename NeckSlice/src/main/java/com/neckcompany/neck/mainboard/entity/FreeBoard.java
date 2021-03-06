package com.neckcompany.neck.mainboard.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="FREE_BOARD", catalog = "NECKSLICE")
public class FreeBoard implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name="FREE_BOARD_ID")
	private Long id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CONTENTS")
	private String contents;
	
	@Column(name="HIT")
	private Integer hit;
	
	@OneToMany(mappedBy="freeBoard")
	private List<Comment> commentList = new ArrayList<>();
	
	@Column(name="CREATE_DATETIME")
	private LocalDateTime createDatetime;
	
	@Column(name="CREATE_USER")
	private String createUser;
	
	@Column(name="UPDATE_DATETIME")
	private LocalDateTime updateDatetime;
	
	@Column(name="UPDATE_USER")
	private String updateUser;
}
