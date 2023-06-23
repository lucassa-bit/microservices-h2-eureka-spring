package projeto.web.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.web.inventoryservice.model.Inventory;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
