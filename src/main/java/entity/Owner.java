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


    @OneToMany(fetch = FetchType.LAZY) //mappedBy = "owner"
    public List<Cat> cats = new ArrayList<>();

    //Constructors
    public Owner() {

    }

    public Owner(String lastName, String firstName, List<Cat> cats) {//

        this.lastName = lastName;
        this.firstName = firstName;
       this.cats = cats;

    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public List<Cat> getCats() {
       return cats;
   }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}