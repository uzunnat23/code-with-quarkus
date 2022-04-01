package services;

import entity.Cat;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CatService {
    public List<Cat> get() {
        List<Cat> cats = Cat.listAll();
        return cats;
    }

    @Transactional
    public boolean create(Cat cat) {
        Cat c = new Cat();
        c.name = cat.getName();
        c.age = cat.getAge();
        c.color = cat.getColor();
        c.owner = cat.getOwner();
        c.persist();
        return c.isPersistent();
    }

    @Transactional
    public void update(Long id, Cat cat) {
        Cat c = Cat.findById(id);
        c.setName(c.getName());
        c.setAge(c.getAge());
        c.setColor(c.getColor());
        c.setOwner(c.getOwner());
    }

    @Transactional
    public boolean delete(Long id) {
        return Cat.deleteById(id);
    }


}
