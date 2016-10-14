package com.demo.web;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lihao on 16/10/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        List<User> list = userService.list(0,10);
        model.addAttribute("users",list);
        return "user/list";
    }

    @RequestMapping(value = "/{userId}/detail",method = RequestMethod.GET)
    public String detail(@PathVariable("userId") long userId, Model model){
        User user = userService.getUser(userId);
        model.addAttribute("user",user);
        return "user/detail";
    }
}
