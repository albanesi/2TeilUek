package ch.lambdaCourse.lambdaprojects.functionalInterfaces;

import ch.lambdaCourse.lambdaprojects.user.User;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface SalaryOperation {
  Optional<User> excetueSalaryOperation(List<User> users);
}
