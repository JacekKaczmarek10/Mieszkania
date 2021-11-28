package pl.kaczmarek.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 1,max = 20,message = "Imię")
    @Column(name = "fist_name")
    private String firstName;

    @Size(min = 1,max = 20,message = "Nazwisko")
    @Column(name = "last_name")
    private String lastName;

    @Size(min = 1,max = 50,message = "Email")
    @Column(name = "email")
    private String email;

    @Size(min = 9, max = 9,message = "Numer musi zawierać 9 cyfr")
    @Column(name = "phone")
    private String phone;

    public User() {

    }

    public static User getInstance(){
        return new User();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
