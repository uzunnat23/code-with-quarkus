package entity;

import enums.Color;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cats")
public class Cat extends PanacheEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "age")
    public int age;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    public Color color;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    public Owner owner;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Toy> toy = new ArrayList<>();

    //Constructors
    public Cat() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Toy> getToy() {
        return toy;
    }

    public void setToy(List<Toy> toy) {
        this.toy = toy;
    }
}
