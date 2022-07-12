package Cam.and.Khalil.SignUp.domain.user.repo;

import Cam.and.Khalil.SignUp.domain.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
