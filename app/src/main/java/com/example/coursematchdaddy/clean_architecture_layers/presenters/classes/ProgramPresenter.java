package com.example.coursematchdaddy.clean_architecture_layers.presenters.classes;

import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.Program;
import com.example.coursematchdaddy.clean_architecture_layers.use_cases.interfaces.recommendationalgorithm_class_imports_implementations.ViewProgramDataInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ProgramPresenter implements ViewProgramDataInterface {

    private HashMap<String, Program> programDataList;

    /**
     *
     * @param programs
     */
    public ProgramPresenter(HashMap<String, Program> programDataList) {
        this.programDataList = programDataList;
    }

<<<<<<< HEAD
    // Provide a method to retrieve the list of program data
    public HashMap<String, Program> getProgramData() {
        return programDataList;
    }

    /**
     * return the list of programs to be displayed
     * @return List<Program> list of programs
     */
    public HashMap<String, Program> getProgramList() {
        return this.programDataList;
    }
=======
    //

    /**
     * Provide a method to retrieve the list of program data, consisting of title, code,
     * and description
     *
     * @return List<HashMap<String, String>> program data list
     */
    public List<HashMap<String, String>> getProgramData() {
        return programDataList;
    }

>>>>>>> main

}