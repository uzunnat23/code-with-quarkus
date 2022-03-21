package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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

    @ManyToOne
    @JsonIgnore
    public Owner owner;

    public Cat() {
    }

    public Cat(String name, int age, Color color, Owner owner) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
    }
}