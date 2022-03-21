package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owner")
public class Owner extends PanacheEntity {

    public String lastName;
    public String firstName;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    public List<Cat> fruits = new ArrayList<>();
}