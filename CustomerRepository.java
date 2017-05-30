package interop;

import java.util.List;

/**
 * Created by tonmoy on 30-May-17.
 */
public interface CustomerRepository {
    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
