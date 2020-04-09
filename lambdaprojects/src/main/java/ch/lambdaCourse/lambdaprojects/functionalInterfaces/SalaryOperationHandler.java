package ch.lambdaCourse.lambdaprojects.functionalInterfaces;

import ch.lambdaCourse.lambdaprojects.user.User;

import java.util.Comparator;
import java.util.List;

public class Calculator  {

 SalaryOperation bestEarningUser=(List<User> users) -> users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).findFirst();
 //SalaryOperation worstEarningUser=(List<User> users) -> users.stream().sorted(Comparator.comparing(User::getSalary()))
 //SalaryOperationMultipleResults allUsersMore2000=(List<User> users) -> users.stream().filter(user->user.getSalary()>2000).collect(Collectors.toList());

 SalaryOperationMultipleResults geradezahle= (List<User>users)->users.stream().filter(user->)
    //   SalaryOperation bestEarningUser2000und3000 =(List<User> users) -> users.stream().filter(user-> user.getSalary()> 2000 && user.getSalary()<3000 ).collect(Collectors.toList());
}
