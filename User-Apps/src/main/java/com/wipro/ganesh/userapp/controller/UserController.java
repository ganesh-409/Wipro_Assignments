package com.wipro.ganesh.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ganesh.userapp.entities.User;
import com.wipro.ganesh.userapp.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController

@RequiredArgsConstructor
@Slf4j
public class UserController {
	
@Autowired
	    private final UserService userService;

	    // 👉 Load the add.html form when visiting "/"
	    
	    // 👉 Handle form submission (Postman version)
	    @PostMapping("/addNewUser")
	    @ResponseBody
	    public User addUser(@RequestBody User user) {
	        return userService.save(user);
	    }
	

    
    @GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
    }
    
    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
    	return userService.findAllUser();
    }
    
    @GetMapping("/getAllUsersPage")
    public Page<User> getAllUserPage(Pageable pageable){
    	return  userService.findAllUserPage(pageable);
    }
    
    @DeleteMapping("/deleteUserById/{id}")
    public String deleteUser(@PathVariable Long id) {
    	 userService.deleteUserById(id);
    	 return "user deleted successfully";
    }
    
    
    
    @PutMapping("/updateUserById/{id}")
    public User updateUserById(@PathVariable Long id,@RequestBody User user) {
    	return userService.updateUserById(id,user);
    	
    }
    
    @PatchMapping("/patchUpdateUserById/{id}")
    public User patchUpdateUserById(@PathVariable Long id,@RequestBody User user) {
    	return userService.patchUpdateUserById(id,user);
    	
    }
    
    @GetMapping("/getUsersByName/{name}")
    public Page<User> getUsersByName(@PathVariable String name, Pageable pageable) {
        return userService.getUsersByName(name, pageable);
    }

    
    
    
}
