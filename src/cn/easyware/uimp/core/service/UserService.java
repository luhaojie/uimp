package cn.easyware.uimp.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.easyware.uimp.core.dao.UserDao;
import cn.easyware.uimp.core.dao.model.User;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;
    
    public User addUser(User user)
    {
        userDao.addUser(user);
        return user;
    }
    
    public List<User> queryUser(User user)
    {
        return userDao.queryUser(user);
    }
    
    public UserDao getUserDao()
    {
        return userDao;
    }
    
    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
}
