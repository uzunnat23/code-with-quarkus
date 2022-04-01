package entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owners")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Owner extends PanacheEntity {


    @Column(name = "lastName", nullable = false)
    public String lastName;
    @Column(name = "firstName", nullable = false)
    public String firstName;

    @JsonInclude()
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
    public List<Cat> cats = new ArrayList<>();

    //Constructors
    public Owner() {
    }

    public Owner(String lastName, String firstName) {//
        this.lastName = lastName;
        this.firstName = firstName;
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
}