package com.team13.recruitmentautomation.service;

import com.team13.recruitmentautomation.model.Vacancies;
import com.team13.recruitmentautomation.repository.VacanciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Albina Melsitova
 */
@Service
public class VacanciesService {

    private final VacanciesRepository vacanciesRepository;

    @Autowired
    public VacanciesService(VacanciesRepository vacanciesRepository) {
        this.vacanciesRepository = vacanciesRepository;
    }
    /**
     * Метод нахождения всех вакансий
     * @return список всех вакансий
     */
    public List<Vacancies> findAllVacancies() {
        return vacanciesRepository.findAll();
    }
}