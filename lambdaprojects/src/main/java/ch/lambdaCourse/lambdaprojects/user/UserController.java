package ch.lambdaCourse.lambdaprojects.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userservice;

    @Autowired
    public UserController(UserService userService){
        this.userservice=userService;
    }
}
