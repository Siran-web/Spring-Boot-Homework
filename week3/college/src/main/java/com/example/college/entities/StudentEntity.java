package com.example.college.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    @ManyToMany
    @JoinTable(
            name = "prof_student",
            joinColumns = @JoinColumn(name = "prof_id"),
            inverseJoinColumns = @JoinColumn(name = "stu_id")
    )
    private List<ProfessorEntity> professor = new ArrayList<>();

    @ManyToMany(mappedBy = "student")
    private List<SubjectEntity> subject = new ArrayList<>();

    @OneToOne(mappedBy = "student") // inverse side
    private AdmissionRecordEntity admissionRecord;
}
