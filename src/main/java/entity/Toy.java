package entity;

import enums.Size;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "toys")
public class Toy extends PanacheEntity {

    @Column(name="name")
    public String name;

    @Column(name = "size")
    @Enumerated(EnumType.STRING)
    public Size size;

    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(
            name = "toys_cats",
            joinColumns = @JoinColumn(name = "Toy_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "cats_id", referencedColumnName = "id"))
    public List<Cat> cats = new ArrayList<>();

    //Constructors
    public Toy() {
    }

    public Toy(String name, Size size, List<Cat> cats) {
        this.name = name;
        this.size = size;
        //      this.cats = cats;
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

}