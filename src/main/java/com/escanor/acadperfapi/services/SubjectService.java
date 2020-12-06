package com.escanor.acadperfapi.services;

public interface SubjectService {
    Integer addSubject(String name);
    void removeSubject(Integer subjectId);
    void updateSubject(Integer subjectId, String name);
    void assignSubject(Integer subjectId, Integer teacherId);
}
