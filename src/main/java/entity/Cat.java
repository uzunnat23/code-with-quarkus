package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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

    @ManyToOne
    @JsonIgnore
    public Owner owner;

    @ManyToMany
    public List<Toy> toys = new ArrayList<>();
}