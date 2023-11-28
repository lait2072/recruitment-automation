package com.team13.recruitmentautomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    // Вставить private final репозитории и конструктор
    private final ApplicationsRepository applicationsRepository;
    private final ReportsRepository reportsRepository;
    private final QuestionnaireRepository questionnaireRepository;


    // Возвращает список всех заявок
    @GetMapping("/customer/applications")
    public String showAllApplications() {
        // Вставить метод сервиса
        applicationsRepository.findAll();
        return "customer/applications";
    }

    // Возвращает одну выбранную заявку
    @GetMapping("/customer/application/{id}")
    public String showApplication(@PathVariable int id) {
        // Вставить метод сервиса
        applicationsRepository.findOne(id);
        return "customer/application";
    }

    // Возвращает окно анкеты (оценки)
    @PostMapping("/customer/questionnaire")
    public String showQuestionnaire() {
        // Вставить метод сервиса
        questionnaireRepository.;
        return "customer/questionnaire";
    }

    // Возвращает список всех отчетов
    @GetMapping("/customer/reports")
    public String showAllReports() {
        // Вставить метод сервиса
        reportsRepository.findAll();
        return "customer/reports";
    }

    // Возвращает выбранный отчет
    @GetMapping("/customer/reports/{id}")
    public String showOneReport(@PathVariable int id) {
        // Вставить метод сервиса
        reportsRepository.findOne(id);
        return "customer/report";
    }

    // Возвращает окно создания заявки на подбор
    @PostMapping("/customer/applications/create-application")
    public String showCreateApplication() {
        // Вставить метод сервиса
        applicationsRepository.;
        return "customer/create_application";
    }

    // Возвращает окно редактирования заявки на подбор
    @PostMapping("/customer/applications/edit-application/{id}")
    public String showEditApplication(@PathVariable int id) {
        // Вставить метод сервиса
        applicationsRepository.;
        return "customer/edit_application";
    }
}
