package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 2, max = 30, message = "Имя должно быть не меньше 2 и не больше 30 символов")
    @NotEmpty(message = "Поле имя дожно быть заполнено")
    @Column(nullable = false)
    private String firstname;

    @Size(min = 2, max = 30, message = "Фамилия должно быть не меньше 2 и не больше 30 символов")
    @NotEmpty(message = "Поле фамилия дожно быть заполнено")
    @Column(name = "lastname")
    private String lastname;

    @Size(min = 2, max = 100, message = "Наименование компании должно быть не меньше 2 символов")
    @NotEmpty(message = "Поле наименование компании дожно быть заполнено")
    @Column(name = "nameCompany")
    private String nameCompany;

    @OneToMany(mappedBy = "nameClient")
    private List<Vacancy> nameVacancy;

    @OneToMany(mappedBy = "customer")
    private List<ContactRegistration> contactRegistrations;

    public Client() {
    }

    public Client(String firstname, String lastname, String nameCompany) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nameCompany = nameCompany;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Vacancy> getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(List<Vacancy> nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
}
