package com.starlingbank.persistence;

import com.starlingbank.company.entities.Employee;
import com.starlingbank.externalservices.Course;

import java.util.List;

public interface CoursePersistenceService {

    void addCourse(String newCourse);
    void enroll(int employeeId, int courseId);
    List<Course> listCourses();
    List<String> showWhatCoursesPersonIsEnrolledIn(int employeeId);

}
