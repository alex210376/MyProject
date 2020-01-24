package academy.lesson12.HW.dao;

import academy.lesson12.HW.model.PhoneBookRecord;
import java.util.List;

public interface PhoneBookDao {
    boolean save(PhoneBookRecord record);
    boolean remove(PhoneBookRecord record);
    List<PhoneBookRecord> getAll();
    PhoneBookRecord findByKeys(String phoneNumber, Long operatorId);
}
