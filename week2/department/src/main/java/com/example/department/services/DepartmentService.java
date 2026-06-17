package com.example.department.services;

import com.example.department.dtos.DepartmentDTO;
import com.example.department.entities.DepartmentEntity;
import com.example.department.exceptions.ResourceNotFoundException;
import com.example.department.repositories.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    final private DepartmentRepository departmentRepository;
    final private ModelMapper modelMapper;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
        this.modelMapper = new ModelMapper();
    }

    public Boolean isExist(Long id){
        Optional<DepartmentEntity> department = departmentRepository.findById(id);
        return department.isPresent();
    }

    public List<DepartmentDTO> getAllDepartments(){
        return departmentRepository.findAll()
                .stream()
                .map(departmentEntity -> modelMapper.map(departmentEntity, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

    public DepartmentDTO getDepartmentById(Long id){
        Boolean flag = isExist(id);
        if(!flag)
            throw new ResourceNotFoundException(" with id" + id);

        Optional<DepartmentEntity> department = departmentRepository.findById(id);
        return modelMapper.map(department, DepartmentDTO.class);
    }

    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO){
        DepartmentEntity toSave = modelMapper.map(departmentDTO, DepartmentEntity.class);
        DepartmentEntity saved = departmentRepository.save(toSave);
        return modelMapper.map(saved, DepartmentDTO.class);
    }

    public DepartmentDTO updateDepartment(Long id, DepartmentDTO departmentDTO){
        DepartmentEntity toUpdate = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" with id " + id));

        toUpdate.setTitle(departmentDTO.getTitle());
        toUpdate.setIsActive(departmentDTO.getIsActive());
        toUpdate.setCreationAt(departmentDTO.getCreationAt());
        return modelMapper.map(departmentRepository.save(toUpdate), DepartmentDTO.class);
    }

    public void deleteDepartment(Long id){
       Boolean flag = isExist(id);
       if(!flag)
           throw new ResourceNotFoundException("with id " + id);
       departmentRepository.deleteById(id);
    }
}
