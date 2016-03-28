package ua.danni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ua.danni.dao.UserDAOImpl;
import ua.danni.model.CustomUser;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserDAOImpl userDao;


    public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.loadUserByUsername(username);
    }

}