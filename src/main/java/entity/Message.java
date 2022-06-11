package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
@Table(name = "message")
//@SecondaryTable(name = "user")
public class Message extends PanacheEntity {

    @Column(name = "message_title")
    public String title;

    @Column(name = "message_text")
    public String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User user;

//    @Column(name = "email", table = "user")
//    public String email;

    public Message() {

    }

    public Message(String title, String text, User user) {
        this.title = title;
        this.text = text;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
