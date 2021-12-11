package co.edu.usa.Reto2.repository;

import co.edu.usa.Reto2.model.Gadget;
import co.edu.usa.Reto2.model.Order;
import co.edu.usa.Reto2.model.User;
import co.edu.usa.Reto2.repository.crud.OrderCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {

    @Autowired
    private OrderCrudRepository orderCrudRepo;


    public List<Order> getAll(){
        return orderCrudRepo.findAll();
    }

    public Optional<Order> getOrder(int id){
        return orderCrudRepo.findById(id);
    }

    public Order create(Order order){
        return orderCrudRepo.save(order);
    }

    public Order update(Order order){
        return orderCrudRepo.save(order);
    }

    public void delete(Order order){
        orderCrudRepo.delete(order);
    }

    public List<Order> getOrderByZone(String zone){
        return orderCrudRepo.findBySalesManZone(zone);

    }

}
