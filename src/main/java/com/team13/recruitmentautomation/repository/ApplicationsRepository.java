package com.team13.recruitmentautomation.repository;

import com.team13.recruitmentautomation.model.Applications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Интерфейс репозитория по заявкам
 */
public interface ApplicationsRepository extends JpaRepository<Applications, Long> {
}
