package me.dio.domain.service.implementation;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.User;
import me.dio.domain.model.repository.UserRepository;
import me.dio.domain.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	// Injeção do userRepository
	private final UserRepository userRepository;
	
	public UserServiceImplementation(UserRepository userRepository) {
		this.userRepository =userRepository;
	}
	
	
	// Procura um usuário, caso não encontre, lança uma exceção. 
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists.");
		}
		return userRepository.save(userToCreate);
	}
		
	
}
