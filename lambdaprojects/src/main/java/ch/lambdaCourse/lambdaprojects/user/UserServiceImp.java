package ch.lambdaCourse.lambdaprojects.user;

import ch.lambdaCourse.lambdaprojects.functionalInterfaces.SalaryOperationHandler;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class UserServiceImp implements UserService{

private SalaryOperationHandler salaryOperationHandler;
private UserRepository userRepository;
public UserServiceImp(SalaryOperationHandler salaryOperationHandler, UserRepository userRepository){
    this.salaryOperationHandler=salaryOperationHandler;
    this.userRepository=userRepository;
}
    @Override
    public User getBestEarningUser() {
    return userRepository.findAll().stream().sorted(Comparator.comparing(User::getSalary))
    }
}
