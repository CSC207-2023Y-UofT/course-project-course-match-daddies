package com.example.coursematchdaddy.clean_architecture_layers.entities.interfaces.program_class_imports_implementations;

import com.example.coursematchdaddy.clean_architecture_layers.entities.classes.User;

public interface Type3ProgramInterface {
    public boolean hasSpace();
    public boolean enroll(User userData, boolean hasRequirements);
    public boolean unenroll(User userData);

}
