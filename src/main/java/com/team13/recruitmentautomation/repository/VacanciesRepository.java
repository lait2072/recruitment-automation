package com.team13.recruitmentautomation.repository;

import com.team13.recruitmentautomation.model.Vacancies;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Интерфейс репозитория по вакансиям
 */
public interface VacanciesRepository extends JpaRepository<Vacancies, Long> {
}
