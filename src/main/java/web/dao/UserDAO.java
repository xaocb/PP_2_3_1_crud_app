package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.List;

@Component
public interface UserDAO {
    List<User> index();
    User show(long id);
    void save(User user);
    void update(long id, User updatedUser);
    void delete(long id);

}
