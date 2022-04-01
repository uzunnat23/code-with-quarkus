package services;

import entity.Owner;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class OwnerService {
    public List<Owner> get() {
        return Owner.listAll();
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
