package com.example.department.dtos;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    private Long Id;
    private String title;
    private Boolean isActive;
    private LocalDateTime CreationAt;

}
