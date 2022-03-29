package com.gl.collegefest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.collegefest.entity.User;
import com.gl.collegefest.repository.UserRepository;
import com.gl.collegefest.security.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private UserRepository userRepository;
	     
	    @Override
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	        User user = userRepository.findByUsername(username);
	         
	        if (user == null) {
	            throw new UsernameNotFoundException("Not able to find the User");
	        }
	         
	        return new MyUserDetails(user);
	    }

}