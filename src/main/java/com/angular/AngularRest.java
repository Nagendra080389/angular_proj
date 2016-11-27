package com.angular;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nagendra on 27-11-2016.
 */
@RestController
public class AngularRest {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/postJSON", method = RequestMethod.POST)
    public User postDataAsJSON(@RequestBody User user){
        return (User) userService.save(user);
    }

    @RequestMapping(value = "/getJSON", method = RequestMethod.GET)
    public List<User> getDataAsJSON(){
        List<User> byName = userService.findAll();
        return byName;
    }

}
