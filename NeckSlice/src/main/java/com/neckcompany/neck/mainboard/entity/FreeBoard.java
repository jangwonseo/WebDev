package com.neckcompany.neck.mainboard.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="FREE_BOARD")
public class FreeBoard {
	
	@Id
	@Column(name="FREE_BOARD_ID")
	private Long freeBoardId;
	
	@Column(name="TITLE")
	private String title;
	
	@Lob
	@Column(name="CONTENTS")
	private String contents;
	
	@Column(name="HIT")
	private Integer hit;
	
	@OneToMany(mappedBy="COMMENT_ID")
	private Comment comment;
	
	@Column(name="CREATE_DATETIME")
	private LocalDateTime createDatetime;
	
	@Column(name="CREATE_USER")
	private String createUser;
	
	@Column(name="UPDATE_DATETIME")
	private LocalDateTime updateDatetime;
	
	@Column(name="UPDATE_USER")
	private String updateUser;
}
