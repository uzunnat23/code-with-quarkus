package services;

import entity.Owner;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class OwnerService {
    public List<Owner> get() {
        List<Owner> listAll = Owner.findAll().list();
        return listAll.stream().map(o -> {
            return new Owner(o.lastName, o.firstName, o.cats);
        }).collect(Collectors.toList());

    }

    @Transactional
    public void create(Owner owner) {
        Owner o = new Owner();
        o.lastName = o.getLastName();
        o.firstName = o.getFirstName();
        o.cats = o.getCats();
        o.persist();
    }

    @Transactional
    public void update(Owner owner) {
        Owner o = PanacheEntityBase.findById(owner.getId());
        o.lastName = o.getLastName();
        o.firstName = o.getFirstName();
        o.cats = o.getCats();
    }

    @Transactional
    public void delete(Long id){
        Owner.deleteById(id);
    }

}
