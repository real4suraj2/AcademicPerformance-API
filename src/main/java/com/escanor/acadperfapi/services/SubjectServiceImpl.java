package com.escanor.acadperfapi.services;

import com.escanor.acadperfapi.repositories.SubjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Integer addSubject(String name) {
        return subjectRepository.addSubject(name);
    }

    @Override
    public void removeSubject(Integer subjectId) {
         subjectRepository.removeSubject(subjectId);
    }

    @Override
    public void updateSubject(Integer subjectId, String name) {
        subjectRepository.updateSubject(subjectId, name);
    }

    @Override
    public void assignSubject(Integer subjectId, Integer teacherId) {
        subjectRepository.assignSubject(subjectId, teacherId);
    }
}
