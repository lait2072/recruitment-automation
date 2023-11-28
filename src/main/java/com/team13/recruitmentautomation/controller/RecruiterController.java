package com.team13.recruitmentautomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecruiterController {

    // Вставить private final репозитории и конструктор
    private final CandidatesRepository candidatesRepository;
    private final ApplicationsRepository applicationsRepository;
    private final VacanciesRepository vacanciesRepository;
    private final EmailTemplatesRepository emailTemplatesRepository;


    // Возвращает список всех кандидатов
    @GetMapping("/recruiter/candidates")
    public String showAllCandidates() {
        // Вставить метод сервиса
        candidatesRepository.findAll();
        return "recruiter/candidates";
    }

    // Возвращает 1 кандидата с переданным id
    @GetMapping("/recruiter/candidates/{id}")
    public String showCandidate(@PathVariable("id") int id) {
        // Вставить метод сервиса
        candidatesRepository.findOne(id);
        return "recruiter/candidate";
    }

    // Возвращает список всех заявок на подбор
    @GetMapping("/recruiter/applications")
    public String showAllApplications() {
        // Вставить метод сервиса
        applicationsRepository.findAll();
        return "recruiter/applications";
    }

    // Возвращает 1 заявку с переданным id
    @GetMapping("/recruiter/applications/{id}")
    public String showCandidate(@PathVariable("id") int id) {
        // Вставить метод сервиса
        applicationsRepository.findOne(id);
        return "recruiter/application";
    }

    // Возвращает все вакансии
    @GetMapping("/recruiter/vacancies")
    public String showVacancies() {
        // Вставить метод сервиса
        vacanciesRepository.findAll();
        return "recruiter/vacancies";
    }

    // Возвращает окно создания новой вакансии
    @PostMapping("/recruiter/vacancies/create-vacancy")
    public String showNewVacancy() {
        // Вставить метод сервиса
        vacanciesRepository.
        return "recruiter/create_vacancy";
    }

    // Возвращает все шаблоны email
    @GetMapping("/recruiter/vacancies/email-templates")
    public String showEmailTemplates() {
        // Вставить метод сервиса
        emailTemplatesRepository.findAll();
        return "recruiter/email_templates";
    }

    // Возвращает окно создания шаблона email
    @PostMapping("/recruiter/vacancies/email-templates/create-template")
    public String showNewTemplate() {
        // Вставить метод сервиса
        emailTemplatesRepository.;
        return "recruiter/create_template";
    }

    // Возвращает окно редактирования шаблона email
    @PostMapping("/recruiter/vacancies/email-templates/edit-template/{id}")
    public String showEditTemplate(@PathVariable int id) {
        // Вставить метод сервиса и передать в него аргумент id
        emailTemplatesRepository.;
        return "recruiter/edit_template";
    }
}
