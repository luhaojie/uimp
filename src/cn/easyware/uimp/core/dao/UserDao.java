package cn.easyware.uimp.core.dao;

import java.util.List;

import cn.easyware.uimp.core.dao.model.User;

public interface UserDao
{
    void addUser(User user);
    
    List<User> queryUser(User user);
    
    User getUserById(Integer id);
}
