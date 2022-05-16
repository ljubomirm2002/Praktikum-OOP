package praktikum_oop.skuci_se.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import praktikum_oop.skuci_se.model.*;
public interface UserRepo extends JpaRepository<User,Integer> {
    public Optional<User> findById(Integer id);
}
