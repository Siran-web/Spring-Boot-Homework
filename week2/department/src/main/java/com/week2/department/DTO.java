package com.week2.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTO {

    private String id;
    private String title;
    private Boolean isActive;
    private Timestamp createdOn;

}
