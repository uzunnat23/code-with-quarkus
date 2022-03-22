package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "toys")
public class Toy extends PanacheEntity {

    enum Size {
        Small,
        Medium,
        Big
    }

    public String name;
    public Size size;

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