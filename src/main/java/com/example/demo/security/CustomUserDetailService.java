package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserReponistory userReponistory;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userReponistory.findByUsername(username);
        String nameUser = user.getUsername();
        if(user==null){
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomUserDetail(user);
    }
}
