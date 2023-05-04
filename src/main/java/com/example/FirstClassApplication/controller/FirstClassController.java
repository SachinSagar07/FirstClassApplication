package com.example.FirstClassApplication.controller;

import com.example.FirstClassApplication.entity.FirstClass;
import com.example.FirstClassApplication.service.FirstClassService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstClassController {

    @Autowired
    private FirstClassService firstCLassService;

    private final Logger LOGGER= LoggerFactory.getLogger(FirstClassController.class);

    @PostMapping("/saveName")
    public FirstClass saveName(@RequestBody FirstClass firstClass){
        LOGGER.info("saveName for FirstClassController");
        return firstCLassService.saveName(firstClass);
    }

    @GetMapping("/getName")
    public List<FirstClass> getName(){
        LOGGER.info("saveName for FirstClassController");
        return firstCLassService.getName();
    }

    @GetMapping("/getByID/{id}")
    public FirstClass getByID(@PathVariable("id") Integer firstClass){
        LOGGER.info("saveName for FirstClassController");
        return firstCLassService.getById(firstClass);
    }


}

