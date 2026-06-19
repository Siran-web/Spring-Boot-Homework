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
@Table(name = "subject")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany
    private List<ProfessorEntity> professor = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "sub_student",
            joinColumns = @JoinColumn(name = "sub_id"),
            inverseJoinColumns = @JoinColumn(name = "stu_id")
    )
    private List<StudentEntity> student = new ArrayList<>();
}
