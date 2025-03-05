package com.example.Crud.Application.controller;

import com.example.Crud.Application.Entity.GeneralEntity;
import com.example.Crud.Application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Employee")
public class Employee {

    @Autowired
    EmployeeRepository E1;
@PostMapping("/create")
    public ResponseEntity<?> createEmployee(@RequestBody  GeneralEntity G1){
        E1.save(G1);
    return new ResponseEntity<>(G1, HttpStatus.OK);
}
    @PostMapping("/delete")
    public ResponseEntity<?> Delete(@RequestBody GeneralEntity G1){
    E1.delete(G1);
    return new ResponseEntity<>(G1,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> list(){
        List L1= new ArrayList<>();
        E1.findAll().forEach(L1 ::add);
        return new ResponseEntity<>(L1,HttpStatus.OK);
    }
    @PostMapping("/delete/{myid}")
    public ResponseEntity<?> deleted(@PathVariable Integer myid,@RequestBody  GeneralEntity G1){
    E1.deleteById(myid);
    return  new ResponseEntity<>(G1,HttpStatus.OK);
    }
    @PostMapping("update/{myid}")
    public ResponseEntity<?> update(@PathVariable Integer myid,@RequestBody GeneralEntity G1){
        GeneralEntity h1 = E1.findById(myid).orElse(null);
        if(h1 == null){
            return new ResponseEntity<>("Employee not found with id " + myid, HttpStatus.NOT_FOUND);
        }
        else{
            h1.setEmp_name(G1.getEmp_name());
            h1.setAge(G1.getAge());
            h1.setEmp_city(G1.getEmp_city());
            h1.setSalary(G1.getSalary());

            E1.save(h1);
        return new ResponseEntity<>(list(),HttpStatus.OK);
        }

    }

}
