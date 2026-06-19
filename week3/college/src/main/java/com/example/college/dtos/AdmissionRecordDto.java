package com.example.college.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdmissionRecordDto {

    private Long id;
    private Integer fees;
    private StudentDto student;

}
