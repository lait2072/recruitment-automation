package com.team13.recruitmentautomation.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "applications")
public class Applications {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_company")
    private String nameCompany;

    @Column(name = "status_app")
    private String status;

    @Column(name = "customer_app")
    private String customer_app;

    @Column(name = "respon_app")
    private String respon_app;

    @Column(name = "close_app")
    private LocalDate close_app;

    @Column(name = "url_vacancy")
    private String url_vacancy;

    public Applications() {
    }

    public Applications(String nameCompany, String status, String customer_app, String respon_app, LocalDate close_app, String url_vacancy) {
        this.nameCompany = nameCompany;
        this.status = status;
        this.customer_app = customer_app;
        this.respon_app = respon_app;
        this.close_app = close_app;
        this.url_vacancy = url_vacancy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomer_app() {
        return customer_app;
    }

    public void setCustomer_app(String customer_app) {
        this.customer_app = customer_app;
    }

    public String getRespon_app() {
        return respon_app;
    }

    public void setRespon_app(String respon_app) {
        this.respon_app = respon_app;
    }

    public LocalDate getClose_app() {
        return close_app;
    }

    public void setClose_app(LocalDate close_app) {
        this.close_app = close_app;
    }

    public String getUrl_vacancy() {
        return url_vacancy;
    }

    public void setUrl_vacancy(String url_vacancy) {
        this.url_vacancy = url_vacancy;
    }

    @Override
    public String toString() {
        return "Applications{" +
                "id=" + id +
                ", nameCompany='" + nameCompany + '\'' +
                ", status='" + status + '\'' +
                ", customer_app='" + customer_app + '\'' +
                ", respon_app='" + respon_app + '\'' +
                ", close_app=" + close_app +
                ", url_vacancy='" + url_vacancy + '\'' +
                '}';
    }
}
