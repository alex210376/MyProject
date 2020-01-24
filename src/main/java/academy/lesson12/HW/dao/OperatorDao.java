package academy.lesson12.HW.dao;

import academy.lesson12.HW.model.Operator;
import java.util.List;

public interface OperatorDao {
    boolean save(Operator operator);
    boolean remove(Operator operator);
    List<Operator> getAll();
    Operator findById(long id);
}
