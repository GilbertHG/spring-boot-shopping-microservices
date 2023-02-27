package sg.com.fairtech.inventory.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sg.com.fairtech.inventory.service.model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
//    Optional<Inventory> findBySkuCode(String skuCode);

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
