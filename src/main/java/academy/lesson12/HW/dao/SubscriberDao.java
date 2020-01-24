package academy.lesson12.HW.dao;

import academy.lesson12.HW.model.Subscriber;
import java.util.List;

public interface SubscriberDao {
    boolean save(Subscriber subscriber);
    boolean remove(Subscriber subscriber);
    List<Subscriber> getAll();
    Subscriber findById(long id);

}
