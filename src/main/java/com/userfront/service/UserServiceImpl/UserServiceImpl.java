package com.userfront.service.UserServiceImpl;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.userfront.dao.UserDao;
import com.userfront.domain.User;

import com.userfront.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	

	//autowired anotasyonu ile dependecy injectionla dao kullanıyoruz.
	@Autowired
	private UserDao userDao;
	
	

    
	//database e kaydediyoruz.
	public void save(User user) {
        userDao.save(user);
    }

  
    
    

    
   

   

    public User saveUser (User user) {
        return userDao.save(user);
    }
    
   

   
}
