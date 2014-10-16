package cn.easyware.uimp.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.easyware.uimp.core.dao.model.User;
import cn.easyware.uimp.core.service.UserService;

/**
 * 
 * 
 * @author Luhj 2014/10/13
 */
@Controller
@RequestMapping(value = "/core/user")
public class CopyOfUserController
{
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model)
    {
        model.addAttribute("users", userService.queryUser(new User()));
        return "core/user/list";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model)
    {
        model.addAttribute(new User());
        return "core/user/add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user)
    {
        userService.addUser(user);
        return "redirect:/core/user/list";
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String update()
    {
        return "list";
    }
    
    public UserService getUserService()
    {
        return userService;
    }
    
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
}
