package web.dao;


import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {

        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Override
    public User show(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(User.class,id);
    }

    @Override
    public void save(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.save(user);
    }

    @Override
    public void update(long id, User updatedUser) {
        Session session = entityManager.unwrap(Session.class);
        User userToBeUpdated = session.get(User.class, id);
        userToBeUpdated.setFirstName(updatedUser.getFirstName());
        userToBeUpdated.setLastName(updatedUser.getLastName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
    }

    @Override
    public void delete(long id) {
        Session session = entityManager.unwrap(Session.class);
        session.remove(session.get(User.class, id));
    }
}
