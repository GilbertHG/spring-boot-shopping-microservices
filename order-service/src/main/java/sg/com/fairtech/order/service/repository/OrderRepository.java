package sg.com.fairtech.order.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sg.com.fairtech.order.service.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
