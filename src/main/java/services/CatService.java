package services;

import entity.Cat;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class CatService {
    public List<Cat> get() {
        List<Cat> listAll = Cat.findAll().list();
        return listAll.stream().map(c -> {
            return new Cat(c.name, c.age, c.color, c.owner, c.toy);
        }).collect(Collectors.toList());

    }

    @Transactional
    public void create(Cat cat) {
        Cat c = new Cat();
        c.name = c.getName();
        c.age = c.getAge();
        c.color = c.getColor();
        c.owner = c.getOwner();
        c.toy = c.getToy();
        c.persist();
    }

    @Transactional
    public void update(Cat cat) {
        Cat c = PanacheEntityBase.findById(cat.getId());
        c.name = c.getName();
        c.age = c.getAge();
        c.color = c.getColor();
        c.owner = c.getOwner();
        c.toy = c.getToy();
    }

    @Transactional
    public void delete(Long id) {
        Cat.deleteById(id);
    }
}
