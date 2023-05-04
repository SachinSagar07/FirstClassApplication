package com.example.FirstClassApplication.service;

import com.example.FirstClassApplication.entity.FirstClass;
import com.example.FirstClassApplication.repository.FirstClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstClassService implements IFirstClassService{

    @Autowired
    private FirstClassRepository firstClassRepository;

    @Override
    public FirstClass saveName(FirstClass firstClass) {
        return firstClassRepository.save(firstClass);
    }

    @Override
    public List<FirstClass> getName() {
        return firstClassRepository.findAll();
    }

    @Override
    public FirstClass getById(Integer id) {
        return firstClassRepository.findById(id).get();
    }

}

