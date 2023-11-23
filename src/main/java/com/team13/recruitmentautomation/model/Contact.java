package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 11, max = 11, message = "Номер телефона содержит 11 символов")
    @Column(name = "telephone", nullable = false)
    @NotEmpty(message = "Поле телефон дожно быть заполнено")
    private String telephone;

    @Column(name = "email", nullable = false)
    @NotEmpty(message = "Поле email дожно быть заполнено")
    @Email(message = "Email должен быть достоверный")
    private String email;

    @Size(max = 30)
    @Column(name = "telegram")
    private String telegram;

    @Size(max = 100)
    @OneToMany(mappedBy = "nameContact")
    List<ContactRegistration> contactRegistrations;

    public Contact() {
    }

    public Contact(String telephone, String email, String telegram) {
        this.telephone = telephone;
        this.email = email;
        this.telegram = telegram;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public List<ContactRegistration> getContactRegistrations() {
        return contactRegistrations;
    }

    public void setContactRegistrations(List<ContactRegistration> contactRegistrations) {
        this.contactRegistrations = contactRegistrations;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", telegram='" + telegram + '\'' +
                ", contactRegistrations=" + contactRegistrations +
                '}';
    }
}
