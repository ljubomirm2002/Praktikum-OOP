package praktikum_oop.skuci_se.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "image_id")
    private int imageId;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "username",unique = true)
    private String username;

    @JsonIgnore
    @Column(name="password")
    private String password;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "role_id",insertable = true,updatable = true)
    private Role role;

    public User(){

    }
    

    public User(String firstName, String lastName, int imageId, String imagePath, String username, String password,
            Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageId = imageId;
        this.imagePath = imagePath;
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public Role getRole() {
        return role;
    }
    public String getRoleName(){
        if(role==null) return "";
        return role.getTitle();
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
