package services;

import entity.Message;


import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.find;

@ApplicationScoped
public class MessageService {
    public List<Message> get() {
        List<Message> messages = Message.listAll();
        return messages;
    }

    @Transactional
    public boolean create(Message message) {
        Message m = new Message();
        m.title = message.getTitle();
        m.text = message.getText();
        m.user = message.getUser();
        m.persist();
        return m.isPersistent();
    }

    @Transactional
    public void update(Long id, Message message) {
        Message m = Message.findById(id);
        m.setTitle(message.getTitle());
        m.setText(message.getText());
        m.setUser(message.getUser());
    }

    @Transactional
    public boolean delete(Long id) {
        return Message.deleteById(id);
    }
}
