package com.example.coursematchdaddy.clean_architecture_layers.use_cases.interfaces.recommendationalgorithm_class_imports_implementations;

import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.Course;

import java.util.HashMap;

public interface ExtractCoursesRecommendationsInterface {
    public String getCourseTitle(Course courseData);
    public String getCourseData();
    public String getCourseDescription(Course courseData);
    public String getImageURL(Course courseData);
    public HashMap<String, Object> getMiscellaneousCourseData(Course courseData);
}
