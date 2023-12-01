package com.team13.recruitmentautomation.service;

import com.team13.recruitmentautomation.model.Candidates;
import com.team13.recruitmentautomation.repository.CandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CandidatesService {

    private final CandidatesRepository candidatesRepository;

    @Autowired
    public CandidatesService(CandidatesRepository candidatesRepository) {
        this.candidatesRepository = candidatesRepository;
    }
    /**
     * Метод нахождения всех кандидатов
     * @return список всех кандидатов
     */
    public List<Candidates>findAllCandidates() {
        return candidatesRepository.findAll();
    }

    /**
     * Методнахождения одного кандидата по уникальному номеру
     * @return однго кандидата по уникальному номеру или null
     */
    public Candidates findCandidateById(long id) {
        Optional<Candidates> foundCandidates = candidatesRepository.findById(id);
        return foundCandidates.orElse(null);
    }
}
