package com.example.department.services;

import com.example.department.dtos.DepartmentDTO;
import com.example.department.entities.DepartmentEntity;
import com.example.department.repositories.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    final private DepartmentRepository departmentRepository;
    final private ModelMapper modelMapper;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
        this.modelMapper = new ModelMapper();
    }

    public List<DepartmentDTO> getAllDepartments(){
        return departmentRepository.findAll()
                .stream()
                .map(departmentEntity -> modelMapper.map(departmentEntity, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

    public DepartmentDTO getDepartmentById(Long id){
        DepartmentEntity department = departmentRepository.findById(id)
                .orElse(null);
        return modelMapper.map(department, DepartmentDTO.class);
    }

    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO){
        DepartmentEntity toSave = modelMapper.map(departmentDTO, DepartmentEntity.class);
        DepartmentEntity saved = departmentRepository.save(toSave);
        return modelMapper.map(saved, DepartmentDTO.class);
    }

    public DepartmentDTO updateDepartment(Long id, DepartmentDTO departmentDTO){
        DepartmentEntity toUpdate = departmentRepository.findById(id)
                .orElse(null);
        modelMapper.map(departmentDTO, toUpdate);
        DepartmentEntity saved = departmentRepository.save(toUpdate);
        return modelMapper.map(saved, DepartmentDTO.class);
    }

    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }
}
