package com.team13.recruitmentautomation.controller;

import com.team13.recruitmentautomation.service.ApplicationsService;
import com.team13.recruitmentautomation.service.CandidatesService;
import com.team13.recruitmentautomation.service.VacanciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controller for recruiter endpoints
 * @author Mylov Sergey <mylov91@yandex.ru>
 * @version 1.0
 */
@Controller
public class RecruiterController {

    /**
     * Inject services for loading objects from database
     * For correct work of application there should be EmailTemplatesService
     * @see CandidatesService
     * @see ApplicationsService
     * @see VacanciesService
     */
    private final CandidatesService candidatesService;
    private final ApplicationsService applicationsService;
    private final VacanciesService vacanciesService;

    @Autowired
    public RecruiterController(CandidatesService candidatesService, ApplicationsService applicationsService, VacanciesService vacanciesService) {
        this.candidatesService = candidatesService;
        this.applicationsService = applicationsService;
        this.vacanciesService = vacanciesService;
    }


    /**
     * Show all candidates
     * @param model used for transfer data from view form to controller
     * @return html form to display all candidates
     */
    @GetMapping("/recruiter/candidates")
    public String showAllCandidates(Model model) {
        candidatesService.findAllCandidates();
        /**
         * There should be model.addAllAttributes() part
         */
        return "recruiter/candidates";
    }

    /**
     * Show selected candidate
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display selected candidate
     */
    @GetMapping("/recruiter/candidates/{id}")
    public String showCandidate(@PathVariable("id") int id, Model model) {
        candidatesService.findCandidateById(id);
        /**
         * There should be model.addAllAttributes() part
         */
        return "recruiter/candidate";
    }

    /**
     * Show all applications
     * @param model used for transfer data from view form to controller
     * @return html form to display all applications
     */
    @GetMapping("/recruiter/applications")
    public String showAllApplications(Model model) {
        applicationsService.findAllApplications();
        return "recruiter/applications";
    }

    /**
     * Show selected application
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display selected candidate
     */
    @GetMapping("/recruiter/applications/{id}")
    public String showApplication(@PathVariable("id") int id, Model model) {
        applicationsService.findCandidateById(id);
        return "recruiter/application";
    }

    /**
     * Show all vacancies
     * @param model used for transfer data from view form to controller
     * @return html form to display all vacancies
     */
    @GetMapping("/recruiter/vacancies")
    public String showVacancies(Model model) {
        vacanciesService.findAllVacancies();
        return "recruiter/vacancies";
    }

    /**
     * Show create vacancy page
     * @param model used for transfer data from view form to controller
     * @return html form to display create vacancy page
     */
    @PostMapping("/recruiter/vacancies/create-vacancy")
    public String showNewVacancy(Model model) {
        return "recruiter/create_vacancy";
    }

    /**
     * Show all email templates
     * @param model used for transfer data from view form to controller
     * @return html form to display all email templates
     */    @GetMapping("/recruiter/vacancies/email-templates")
    public String showEmailTemplates(Model model) {
        return "recruiter/email_templates";
    }

    /**
     * Show create email template page
     * @param model used for transfer data from view form to controller
     * @return html form to display create email template
     */
    @PostMapping("/recruiter/vacancies/email-templates/create-template")
    public String showNewTemplate(Model model) {
        return "recruiter/create_template";
    }

    /**
     * Show edit email template page
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display edit email template
     */
    @PostMapping("/recruiter/vacancies/email-templates/edit-template/{id}")
    public String showEditTemplate(@PathVariable int id, Model model) {
        return "recruiter/edit_template";
    }
}
