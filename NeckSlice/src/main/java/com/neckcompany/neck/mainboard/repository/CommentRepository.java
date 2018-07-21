package com.neckcompany.neck.mainboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neckcompany.neck.mainboard.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
