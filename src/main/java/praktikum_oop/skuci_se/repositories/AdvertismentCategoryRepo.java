package praktikum_oop.skuci_se.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import praktikum_oop.skuci_se.model.AdvertismentCategory;

public interface AdvertismentCategoryRepo extends JpaRepository<AdvertismentCategory,Integer> {
    
}
