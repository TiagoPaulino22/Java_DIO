package me.dio.domain.service;

import me.dio.domain.model.User;

public interface UserService {
	
	//Métodos para uso dos usuários
	User findById(Long id); 
	
	User create(User userToCreate);
	
	
}
