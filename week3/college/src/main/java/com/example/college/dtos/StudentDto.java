package com.example.college.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long id;
    private String Name;
    private List<ProfessorDto> professors;
    private List<SubjectDto> subjects;

}
