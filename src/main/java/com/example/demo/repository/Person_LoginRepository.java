package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.keys.Person.Person_Login_Keys;
import com.example.demo.model.mysql.Person_Login;
@Repository
public interface Person_LoginRepository extends JpaRepository<Person_Login, Person_Login_Keys>{

}
