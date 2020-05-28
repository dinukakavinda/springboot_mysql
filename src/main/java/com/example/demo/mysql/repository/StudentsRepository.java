package com.example.demo.mysql.repository;

import com.example.demo.mysql.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {

}
