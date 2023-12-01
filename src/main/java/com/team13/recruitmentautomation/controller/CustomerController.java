package com.team13.recruitmentautomation.controller;

import com.team13.recruitmentautomation.service.ApplicationsService;
import com.team13.recruitmentautomation.service.CandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Controller for customer endpoints
 * @author Mylov Sergey <mylov91@yandex.ru>
 * @version 1.0
 */
@Controller
public class CustomerController {

    /**
     * Inject services for loading objects from database
     * For correct work of application there should be ReportService and QuestionnaireService
     * @see ApplicationsService
     * @see CandidatesService
     */
    private final ApplicationsService applicationsService;
    private final CandidatesService candidatesService;

    @Autowired
    public CustomerController(ApplicationsService applicationsService, CandidatesService candidatesService) {
        this.applicationsService = applicationsService;
        this.candidatesService = candidatesService;
    }

    /**
     * Show all applications
     * @param model used for transfer data from view form to controller
     * @return html form to display all applications
     */
    @GetMapping("/customer/applications")
    public String showAllApplications(Model model) {
        applicationsService.findAllApplications();
        /**
         * There should be model.addAllAttributes() part
         */
        return "customer/applications";
    }

    /**
     * Show selected application
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display selected application
     */
    @GetMapping("/customer/application/{id}")
    public String showApplication(@PathVariable int id, Model model) {
        applicationsService.findCandidateById(id);
        /**
         * There should be model.addAllAttributes() part
         */
        return "customer/application";
    }

    /**
     * Show questionnaire page
     * @param model used for transfer data from view form to controller
     * @return html form to display questionnaire
     */
    @PostMapping("/customer/questionnaire")
    public String showQuestionnaire(Model model) {
        return "customer/questionnaire";
    }

    /**
     * Show all reports
     * @param model used for transfer data from view form to controller
     * @return html form to display reports
     */
    @GetMapping("/customer/reports")
    public String showAllReports(Model model) {
        return "customer/reports";
    }

    /**
     * Show selected report
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display selected report
     */
    @GetMapping("/customer/reports/{id}")
    public String showOneReport(@PathVariable int id, Model model) {
        return "customer/report";
    }

    /**
     * Show new application page
     * @param model used for transfer data from view form to controller
     * @return html form to display new application
     */
    @PostMapping("/customer/applications/create-application")
    public String showCreateApplication(Model model) {
        return "customer/create_application";
    }

    /**
     * Show edit application page
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display edit application
     */
    @PostMapping("/customer/applications/edit-application/{id}")
    public String showEditApplication(@PathVariable int id, Model model) {
        return "customer/edit_application";
    }

    /**
     * Show all candidates
     * @param model used for transfer data from view form to controller
     * @return html form to display all candidates
     */
    @GetMapping("/customer/candidates")
    public String showAllCandidates(Model model) {
        candidatesService.findAllCandidates();
        return "customer/candidates";
    }

    /**
     * Show selected candidate
     * @param id unique identifier in database
     * @param model used for transfer data from view form to controller
     * @return html form to display selected candidate
     */
    @GetMapping("/customer/candidates/{id}")
    public String showCandidate(@PathVariable int id, Model model) {
        candidatesService.findCandidateById(id);
        return "customer/candidate";
    }
}
