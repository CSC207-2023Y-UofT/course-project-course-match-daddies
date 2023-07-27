package com.example.coursematchdaddy.clean_architecture_layers.use_cases.classes.recommendationalgorithm_subclasses;

import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.Course;
import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.User;
import com.example.coursematchdaddy.clean_architecture_layers.use_cases.classes.RecommendationAlgorithm;

public class ViewCourseData extends RecommendationAlgorithm {
    private User user;
    public ViewCourseData(User user) {
        this.user = user;
    }

    /**
     * return the course associated with courseCode
     * @param courseCode: String
     * @return Course
     */
    public Course getCourseData(String courseCode) {
        return this.user.getSelectedCourses().get(courseCode);
    }
}
