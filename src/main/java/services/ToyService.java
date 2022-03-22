package services;

import entity.Toy;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class ToyService {
    public List<Toy> get() {
        List<Toy> listAll = Toy.findAll().list();
        return listAll.stream().map(t -> {
            return new Toy(t.name, t.size, t.cats);
        }).collect(Collectors.toList());

    }

    @Transactional
    public void create(Toy toy) {
        Toy t = new Toy();
        t.name = t.getName();
        t.size = t.getSize();
        t.cats = t.getCats();
        t.persist();
    }

    @Transactional
    public void update(Toy toy) {
        Toy t = PanacheEntityBase.findById(toy.getId());
        t.name = t.getName();
        t.size = t.getSize();
        t.cats = t.getCats();
    }

    @Transactional
    public void delete(Long id) {
        Toy.deleteById(id);
    }
}
