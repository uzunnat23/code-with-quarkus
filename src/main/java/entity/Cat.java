package entity;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "cats")
public class Cat extends PanacheEntity {
    enum Color {
        Black,
        White,
        Brown,
        Ginger
    }

    public String name;
    public int age;
    public Color color;

    @ManyToOne(fetch = FetchType.LAZY)
    // @JsonIgnore
    public Owner owner;

    @ManyToMany(fetch = FetchType.LAZY)
    public List<Toy> toy = new ArrayList<>();

    //Constructors
    public Cat() {
    }

    public Cat(String name, int age, Color color, Owner owner, List<Toy> toy) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
        this.toy = toy;
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