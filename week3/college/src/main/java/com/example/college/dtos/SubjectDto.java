package com.example.college.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {

    private Long id;
    private String title;
    private ProfessorDto professor;
    private List<StudentDto> students;

}
