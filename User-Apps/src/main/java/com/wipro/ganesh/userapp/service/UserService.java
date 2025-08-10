package com.wipro.ganesh.userapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.ganesh.userapp.entities.User;

public interface UserService {

	User save(User user);

	User getUserById(Long id);

	List<User> findAllUser();

	Page<User> findAllUserPage(Pageable pageable);

	void deleteUserById(Long id);

	User patchUpdateUserById(Long id, User user);

	User updateUserById(Long id, User user);

	Page<User> getUsersByName(String name, Pageable pageable);

	Object getAll();
	

}
