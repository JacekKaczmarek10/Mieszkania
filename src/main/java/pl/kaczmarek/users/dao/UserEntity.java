package pl.kaczmarek.users.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

@Entity
@Data
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 1,max = 20,message = "Imię")
    @Column(name = "fist_name")
    public String firstName;

    @Size(min = 1,max = 20,message = "Nazwisko")
    @Column(name = "last_name")
    public String lastName;

    @Size(min = 1,max = 50,message = "Email")
    @Column(name = "email")
    public String email;

    @Size(min = 9, max = 9,message = "Numer musi zawierać 9 cyfr")
    @Column(name = "phone")
    public String phone;


}
