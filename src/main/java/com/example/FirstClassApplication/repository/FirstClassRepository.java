package com.example.FirstClassApplication.repository;

import com.example.FirstClassApplication.entity.FirstClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstClassRepository extends JpaRepository<FirstClass,Integer> {

}
