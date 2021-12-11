package co.edu.usa.Reto2.repository.crud;

import co.edu.usa.Reto2.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface OrderCrudRepository extends MongoRepository<Order,Integer> {


    List<Order> findBySalesManZone(String Zone);
}
