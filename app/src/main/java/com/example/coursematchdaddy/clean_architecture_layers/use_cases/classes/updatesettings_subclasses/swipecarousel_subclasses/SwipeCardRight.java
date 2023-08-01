package com.example.coursematchdaddy.clean_architecture_layers.use_cases.classes.updatesettings_subclasses.swipecarousel_subclasses;

import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.Course;
import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.Program;
import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.Survey;
import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.User;
import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.user_subclasses.LoggedInUser;
import com.example.coursematchdaddy.clean_architecture_layers.use_cases.classes.SwipeCarousel;
import com.example.coursematchdaddy.clean_architecture_layers.use_cases.interfaces.swipecarousel_class_imports_implementations.ExtractCourseDataInterface;
import com.example.coursematchdaddy.clean_architecture_layers.use_cases.interfaces.swipecarousel_class_imports_implementations.ExtractProgramDataInterface;
import com.example.coursematchdaddy.clean_architecture_layers.use_cases.interfaces.swipecarousel_class_imports_implementations.SwipeCardRightInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a subclass of SwipeCarousel that represents the swipe right action.
 * It extends the SwipeCarousel class.
 */
public class SwipeCardRight extends SwipeCarousel{

    /**
     * Constructor to initialize the SwipeCardRight.
     *
     * @param loggedInUser The logged-in user.
     */
    public SwipeCardRight(User loggedInUser) {
        super(loggedInUser);
    }

    /**
     * This method represents the behavior for the right swipe action.
     * Adds the course to the users selected courses
     *
     * @param courseData The course data for which the swipe action is performed.
     * @return True to indicate that the course has been added to the selected list
     */
    @Override
    public boolean processSwipe(Course courseData) {
        String courseString = courseData.getCourseTitle();
        Map<String, Course> courseMap = new HashMap<>();
        courseMap.put(courseString, courseData);
        loggedInUser.updateUserSelectedCourses(courseMap);
        return true;
    }
}
