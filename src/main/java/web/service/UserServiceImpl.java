package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Transactional
    @Override
    public List<User> index() {
        return null;
    }

    @Override
    public User show(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(int id, User updatedUser) {

    }

    @Override
    public void delete(int id) {

    }
}
