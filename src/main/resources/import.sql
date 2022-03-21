-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into cat_entity (id, name,color,age) values(nextval('hibernate_sequence'), 'Ugolek','Black','1');

package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "cats")
public class Cat extends PanacheEntity {

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