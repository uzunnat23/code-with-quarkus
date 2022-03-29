package services;

import entity.Owner;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class OwnerService {
    public List<Owner> get() {
        List<Owner> listAll = Owner.findAll().list();
        return listAll.stream().map(o -> {
            return new Owner(o.lastName, o.firstName); //, o.cats
        }).collect(Collectors.toList());
    }


    @Transactional
    public boolean create(Owner owner) {
        Owner o = new Owner();
        o.lastName = owner.getLastName();
        o.firstName = owner.getFirstName();
        o.persist();
        return o.isPersistent();
    }

    @Transactional
    public void update(Long id, Owner owner) {
        Owner o = Owner.findById(id);
        o.setLastName(owner.getLastName());
        o.setFirstName(owner.getFirstName());
    }

    @Transactional
    public boolean delete(Long id) {
        return Owner.deleteById(id);
    }

}
