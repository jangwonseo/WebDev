package com.neckcompany.neck.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Board {

	private Long id;
	private String title;
	private String content;
	private String author;
	private LocalDateTime createDatetime;
	private LocalDateTime updateDatetime;
}
