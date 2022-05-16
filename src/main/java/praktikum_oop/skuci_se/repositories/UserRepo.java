package praktikum_oop.skuci_se.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum_oop.skuci_se.model.*;
public interface UserRepo extends JpaRepository<User,Integer> {
    
}
