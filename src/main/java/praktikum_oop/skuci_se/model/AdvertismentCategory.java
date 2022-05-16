package praktikum_oop.skuci_se.model;

import javax.persistence.*;

@Entity
@Table(name = "advertisment_categories")
public class AdvertismentCategory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
