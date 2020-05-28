package com.example.demo.mysql.resource;

import com.example.demo.mysql.model.Students;
import com.example.demo.mysql.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    StudentsRepository studentsRepository;

    @GetMapping(value = "/all")
    public List<Students> getAll(){
        return studentsRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Students> persist(@RequestBody final Students user){
        studentsRepository.save(user);
        return studentsRepository.findAll();
    }



}
