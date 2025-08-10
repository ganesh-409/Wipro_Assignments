package com.wipro.ganesh.userapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.ganesh.userapp.entities.User;
import com.wipro.ganesh.userapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
   @Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

   @Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

   @Override
	public List<User> findAllUser() {
	
		return userRepository.findAll();
	}

   @Override
	public Page<User> findAllUserPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return userRepository.findAll(pageable);
	}

   @Override
   public void deleteUserById(Long id) {
      
	    userRepository.deleteById(id);
	
   }

   @Override
   public User updateUserById(Long id, User user) {

	User existedUser=userRepository.findById(id).orElseThrow(()->new RuntimeException("user with that id not present"+id));
	existedUser.setName(user.getName());
	existedUser.setEmail(user.getEmail());
	return userRepository.save(existedUser);
	
   }

   @Override
   public User patchUpdateUserById(Long id, User user) {
	

		User existedUser=userRepository.findById(id).orElseThrow(()->new RuntimeException("user with that id not present"+id));
		if(user.getName()!=null) {
		existedUser.setName(user.getName());
		}
		if(user.getEmail()!=null) {
		existedUser.setEmail(user.getEmail());
		}
		return userRepository.save(existedUser);
   }

  

  
	
   @Override
   public Page<User> getUsersByName(String name, Pageable pageable) {
       return userRepository.findByNameIgnoreCase(name, pageable);
   }

   @Override
   public Object getAll() {
	// TODO Auto-generated method stub
	return null;
   }

		
	
	
}