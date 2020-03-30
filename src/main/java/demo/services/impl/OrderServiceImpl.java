package demo.services.impl;


import demo.models.order.Order;
import demo.repositories.OrderRepository;
import demo.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderRepository orderRepository;

    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }
}
