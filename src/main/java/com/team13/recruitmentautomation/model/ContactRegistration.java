package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "contactRegistration")
public class ContactRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "consumer_id", referencedColumnName = "id")
    private Consumers consumer;

    @ManyToOne
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private Contact nameContact;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client customer;

    public ContactRegistration() {
    }

    public ContactRegistration(Consumers consumer) {
        this.consumer = consumer;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Consumers getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumers consumer) {
        this.consumer = consumer;
    }

    public Contact getNameContact() {
        return nameContact;
    }

    public void setNameContact(Contact nameContact) {
        this.nameContact = nameContact;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ContactRegistration{" +
                "id=" + id +
                ", consumer=" + consumer +
                ", nameContact=" + nameContact +
                ", customer=" + customer +
                '}';
    }
}
