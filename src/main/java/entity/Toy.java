package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
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

    @ManyToMany
    public List<Cat> cats = new ArrayList<>();

}