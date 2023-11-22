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
    private Contact contact;

    @Column(name = "dateRegistred")
    private LocalDate registeredAt;

    public ContactRegistration() {
    }

    public ContactRegistration(Consumers consumer, Contact contact, LocalDate registeredAt) {
        this.consumer = consumer;
        this.contact = contact;
        this.registeredAt = registeredAt;
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public LocalDate getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDate registeredAt) {
        this.registeredAt = registeredAt;
    }

    @Override
    public String toString() {
        return "ContactRegistration{" +
                "id=" + id +
                ", consumer=" + consumer +
                ", contact=" + contact +
                ", registeredAt=" + registeredAt +
                '}';
    }
}
