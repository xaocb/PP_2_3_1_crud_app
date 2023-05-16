package web.dao;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.User;
import javax.persistence.EntityManagerFactory;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO{
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public List<User> index() {

        Session session = entityManagerFactory.unwrap(Session.class);
        return session.createQuery("select u from User u", User.class)
                .getResultList();
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
