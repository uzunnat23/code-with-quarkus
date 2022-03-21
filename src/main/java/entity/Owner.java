package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner extends PanacheEntity {

    public String lastName;
    public String firstName;


    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    public List<Cat> cats = new ArrayList<>();

    //Constructors
    public Owner() {
    }

    public Owner(String lastName, String firstName, List<Cat> cats) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.cats = cats;
    }
}