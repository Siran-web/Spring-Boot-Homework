package com.example.department.dtos;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    private Long Id;

    @Size(min = 1, max = 10)
    private String title;

    @AssertTrue
    private Boolean isActive;

    @PastOrPresent
    private LocalDateTime CreationAt;

}
