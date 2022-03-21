package test;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cat")
public class CatEntity extends PanacheEntity {
    public String name;
    public String color;
    public int age;


}