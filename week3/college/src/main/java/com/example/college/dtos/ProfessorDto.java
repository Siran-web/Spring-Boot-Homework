package com.example.college.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorDto {

    private Long id;
    private String title;
    private List<StudentDto> students;
    private List<SubjectDto> subjects;

}
