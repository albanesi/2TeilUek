package ch.lambdaCourse.lambdaprojects.user;

import java.util.Optional;

public interface UserService {
  Optional<User> getBestEarningUser();

}
