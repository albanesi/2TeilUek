package ch.lambdaCourse.lambdaprojects;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface SalaryOperation {
  Optional<User> excetueSalaryOperation(List<User> users);
}
