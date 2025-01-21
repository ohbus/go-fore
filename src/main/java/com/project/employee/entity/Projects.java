package com.project.employee.entity;

import java.util.List;

public class Projects {

    private Long id;

    private String name;

    private List<MinimumRatings> minimumRatings = new ArrayList<>(); 

    private List<Employees> employees = new ArrayList<>();

    
}