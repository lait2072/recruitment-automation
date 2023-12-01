package com.team13.recruitmentautomation.repository;


import com.team13.recruitmentautomation.model.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Интерфейс репозитория по кандидатам
 * @author Albina Melsitova
 */
public interface CandidatesRepository extends JpaRepository<Candidates, Long> {
}