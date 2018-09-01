package com.neckcompany.neck.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neckcompany.neck.login.entity.User;
import com.neckcompany.neck.login.repository.UserRepository;

@Service
@Transactional
public class UserImpl {

	@Autowired UserRepository userRepository;
	
	public User login(User user) {
		return userRepository.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
