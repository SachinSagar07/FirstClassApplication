package com.example.FirstClassApplication.service;

import com.example.FirstClassApplication.entity.FirstClass;

import java.util.List;

public interface IFirstClassService {
    public FirstClass saveName(FirstClass firstClass);

    public List<FirstClass> getName();

    public  FirstClass getById(Integer firstClass);
}
