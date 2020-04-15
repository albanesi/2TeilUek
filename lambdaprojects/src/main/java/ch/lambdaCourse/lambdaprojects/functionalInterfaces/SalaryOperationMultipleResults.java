package ch.lambdaCourse.lambdaprojects.functionalInterfaces;

import ch.lambdaCourse.lambdaprojects.user.User;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface SalaryOperationMultipleResults {
    Optional<List<User>> exce(List<User> users);
}
