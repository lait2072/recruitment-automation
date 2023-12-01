package com.team13.recruitmentautomation.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Класс сущность "Вакансия"
 */
@Entity
@Table(name = "vacancies")
public class Vacancies {
    /**
     *Поле с уникальным идентификатором
     */
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     * Поле название вакансии
     */
    @Column(name = "nameVacancy", nullable = false)
    private String nameVacancy;
    /**
     * Поле оплата в случае взятия на работу
     */
    @Column(name = "salary")
    private int salary;
    /**
     * Поле статус вакансии
     */
    @Column(name = "status_vacancy")
    private String status;
    /**
     * Поле дата закрытия вакансии
     */
    @Column(name = "close_vacancy")
    private LocalDate closeVacancy;
    /**
     * Поле ответственный
     */
    @Column(name = "respons_vacancy")
    private String responsVacancy;
    /**
     * Поле заказчик
     */
    @Column(name = "consumer")
    private String consumer;
    /**
     * Поле кандидат
     */
    @Column(name = "candidate_vacancy")
    private String candidate;

    public Vacancies() {
    }

    /**
     * Конструктор с параметрами
     * @param nameVacancy - наименование вакансии
     * @param salary - доход
     * @param status - статус вакансии
     * @param closeVacancy - дата закрытия вакансии
     * @param responsVacancy - ответственный
     * @param consumer - заказчик
     * @param candidate - кандидат на вакансию
     */
    public Vacancies(String nameVacancy, int salary, String status, LocalDate closeVacancy, String responsVacancy, String consumer, String candidate) {
        this.nameVacancy = nameVacancy;
        this.salary = salary;
        this.status = status;
        this.closeVacancy = closeVacancy;
        this.responsVacancy = responsVacancy;
        this.consumer = consumer;
        this.candidate = candidate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCloseVacancy() {
        return closeVacancy;
    }

    public void setCloseVacancy(LocalDate closeVacancy) {
        this.closeVacancy = closeVacancy;
    }

    public String getResponsVacancy() {
        return responsVacancy;
    }

    public void setResponsVacancy(String responsVacancy) {
        this.responsVacancy = responsVacancy;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Vacancies{" +
                "id=" + id +
                ", nameVacancy='" + nameVacancy + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                ", closeVacanсy=" + closeVacancy +
                ", responsVacanсye='" + responsVacancy + '\'' +
                ", consumer='" + consumer + '\'' +
                ", candidate='" + candidate + '\'' +
                '}';
    }
}
