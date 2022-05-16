package praktikum_oop.skuci_se.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import praktikum_oop.skuci_se.model.Role;

public interface RoleRepo extends JpaRepository<Role,Integer> {
}
