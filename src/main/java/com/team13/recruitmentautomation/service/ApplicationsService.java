package com.team13.recruitmentautomation.service;

import com.team13.recruitmentautomation.model.Applications;
import com.team13.recruitmentautomation.repository.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationsService {

    private final ApplicationsRepository applicationsRepository;

    @Autowired
    public ApplicationsService(ApplicationsRepository applicationsRepository) {
        this.applicationsRepository = applicationsRepository;
    }

    public List<Applications> findAllApplications() {
        return applicationsRepository.findAll();
    }

    public Applications findCandidateById(long id) {
        Optional<Applications> foundApplications = applicationsRepository.findById(id);
        return foundApplications.orElse(null);
    }
}
