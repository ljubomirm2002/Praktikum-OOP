package praktikum_oop.skuci_se.model;

import javax.persistence.*;


@Entity
@Table(name = "roles")
public class Role {

    public Role(){

    }
    public Role(Integer id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;
    
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
