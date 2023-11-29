package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

    @Entity
    @Table(name = "candidates")
    public class Candidates {

        @Id
        @Column(name = "id", nullable = false, unique = true)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @NotEmpty(message = "Поле имя дожно быть заполнено")
        @Column(name = "firstname", nullable = false)
        private String firstname;

        @NotEmpty(message = "Поле фамилия дожно быть заполнено")
        @Column(name = "lastname", nullable = false)
        private String lastname;

        @Column(name = "status")
        private String status;

        @Column(name = "contact", nullable = false)
        private String contact;

        @Column(name = "responsible")
        private String responsible;

        @Column(name = "vacancy", nullable = false)
        private String vacancy;

        @Column(name = "commentary")
        private String commentary;

        public Candidates() {
        }

        public Candidates(String firstname, String lastname, String status, String contact, String responsible, String vacancy, String commentary) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.status = status;
            this.contact = contact;
            this.responsible = responsible;
            this.vacancy = vacancy;
            this.commentary = commentary;
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getResponsible() {
            return responsible;
        }

        public void setResponsible(String responsible) {
            this.responsible = responsible;
        }

        public String getVacancy() {
            return vacancy;
        }

        public void setVacancy(String vacancy) {
            this.vacancy = vacancy;
        }

        public String getCommentary() {
            return commentary;
        }

        public void setCommentary(String commentary) {
            this.commentary = commentary;
        }

        @Override
        public String toString() {
            return "Candidates{" +
                    "id=" + id +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", status='" + status + '\'' +
                    ", contact='" + contact + '\'' +
                    ", responsible='" + responsible + '\'' +
                    ", vacancy='" + vacancy + '\'' +
                    ", commentary='" + commentary + '\'' +
                    '}';
        }
    }
