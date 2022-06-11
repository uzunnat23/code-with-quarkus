package entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")

public class User extends PanacheEntity {
    @Column(name = "email")
    public String email;

    @Column(name = "password")
    public String password;

    @Column(name = "nickname" )
    public String nickname;

    public static User findByEmail(String email){
        return find("email", email).firstResult();
    }
//    @JsonInclude()
//    @OneToMany
//    public List<Message> messages;

    //   Constructors
    public User() {
    }

    public User(String email, String password, String nickname) { //, List<Message> messages
        this.email = email;
        this.password = password;
        this.nickname = nickname;
//        this.messages = messages;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

//    public List<Message> getMessages() {
//        return messages;
//    }
//
//    public void setMessages(List<Message> messages) {
//        this.messages = messages;
//    }
}
