package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Transactional
    @Override
    public List<User> index() {
        return userDAO.index();
    }
    @Transactional
    @Override
    public User show(long id) {
        return userDAO.show(id);
    }
    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }
    @Transactional
    @Override
    public void update(long id, User updatedUser) {
        userDAO.update(id,updatedUser);
    }
    @Transactional
    @Override
    public void delete(long id) {
        userDAO.delete(id);
    }
}
