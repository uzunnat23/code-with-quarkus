package entity;

import enums.Size;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "toys")
public class Toy extends PanacheEntity {

    public String name;

    @Enumerated(EnumType.STRING)
    public Size size;


    //    @JoinTable(
//            name = "toys_cats",
//            joinColumns = @JoinColumn(name = "Toy_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "cats_id", referencedColumnName = "id"))
    @ManyToMany(fetch = FetchType.LAZY)
    public List<Cat> cats = new ArrayList<>();

    //Constructors
    public Toy() {
    }

    public Toy(String name, Size size, List<Cat> cats) {
        this.name = name;
        this.size = size;
        this.cats = cats;
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

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}