package ch.course223.springadvanced.domainModels.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<User> getBestEarningUser() {
        return new ResponseEntity<User>(userService.getBestEarningUser(), HttpStatus.OK);
    }

    @GetMapping("/getWorstEarningUser")
    public @ResponseBody ResponseEntity<User> getWorstEarningUser() {
        return new ResponseEntity<User>(userService.getWorstEarningUser(), HttpStatus.OK);
    }
    @GetMapping("/getAllUsersEarningBetween/{x}?{y}")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningBetween(int x, int y) {
        return new ResponseEntity<List<User>>(userService.allUsersEarningBetween(x, y), HttpStatus.OK);
    }
    @GetMapping("/getAllUsersEarningLessThan/{x}")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningLessThan(int x) {
        return new ResponseEntity<List<User>>(userService.allUsersEarningLessThan(x), HttpStatus.OK);
    }
    @GetMapping("/getAllUsersEarningMoreThan/{x}")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningMoreThan(int x) {
        return new ResponseEntity<List<User>>(userService.allUsersEarningMoreThan(x), HttpStatus.OK);
    }
    @GetMapping("/getAllUsersWithEvenEarnings")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersWithEvenEarnings() {
        return new ResponseEntity<List<User>>(userService.allUsersWithEvenEarnings(), HttpStatus.OK);
    }
    @GetMapping("/getAllUsersEarningLessThan")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningOddEarnings() {
        return new ResponseEntity<List<User>>(userService.allUsersWithOddEarnings(), HttpStatus.OK);
    }
    //Remaining UserServices are to be implemented

}
