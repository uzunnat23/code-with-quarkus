package services;

import entity.Toy;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
public class ToyService {
    public List<Toy> get() {
        List<Toy> toys = Toy.listAll();
        return toys;
    }

    @Transactional
    public boolean create(Toy toy) {
        Toy t = new Toy();
        t.name = toy.getName();
        t.size = toy.getSize();
        t.persist();
        return t.isPersistent();
    }

    @Transactional
    public void update(Long id, Toy toy) {
        Toy t = Toy.findById(id);
        t.setName(toy.getName());
        t.setSize(toy.getSize());
    }

    @Transactional
    public boolean delete(Long id) {
        return Toy.deleteById(id);
    }
}
