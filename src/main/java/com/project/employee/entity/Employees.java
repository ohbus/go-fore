package com.project.employee.entity;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Employees {

    private Long id;

    private String name;

    private List<SkillRatings> skillRatings = new ArrayList<>(); 
}