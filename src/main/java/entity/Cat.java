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
    public List<Toy> toys = new ArrayList<>();

    //Constructors
    public Cat(){
    }

    public Cat(String name, int age, Color color, Owner owner, List<Toy> toys) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
        this.toys = toys;
    }


}