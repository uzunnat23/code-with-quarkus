package services;

import entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.find;

@ApplicationScoped
public class UserService {
    public List<User> get() {
        List<User> users = User.listAll();
        return users;
    }




    @Transactional
    public boolean create(User user) {
        User u = new User();
        u.email = user.getEmail();
        u.password = user.getPassword();
        u.nickname = user.getNickname();

        u.persist();
        return u.isPersistent();
    }

    @Transactional
    public void update(Long id, User user) {
        User u = User.findById(id);
        u.setEmail(user.getEmail());
        u.setPassword(user.getPassword());
        u.setNickname(user.getNickname());

    }

    @Transactional
    public boolean delete(Long id) {
        return User.deleteById(id);
    }

}
