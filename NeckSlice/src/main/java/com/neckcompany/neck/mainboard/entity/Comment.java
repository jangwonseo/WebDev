package com.neckcompany.neck.mainboard.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COMMENT", catalog = "Main_Board")
public class Comment {
	
	@Id @GeneratedValue
	@Column(name="COMMENT_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="FREE_BOARD_ID")
	private FreeBoard freeBoard;
	
	@Column(name="TITLE")
	private String title;
	
	@Lob
	@Column(name="CONTENTS")
	private String contents;
	
	@Column(name="LIKE")
	private Integer like;
	
	@Column(name="CREATE_DATETIME")
	private LocalDateTime createDatetime;
	
	@Column(name="CREATE_USER")
	private String createUser;
	
	@Column(name="UPDATE_DATETIME")
	private LocalDateTime updateDatetime;
	
	@Column(name="UPDATE_USER")
	private String updateUser;
}
