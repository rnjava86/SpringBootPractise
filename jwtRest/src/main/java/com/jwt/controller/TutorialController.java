package com.jwt.controller;


import com.jwt.model.Tutorial;
import com.jwt.repository.TutorialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {
    @Autowired
    TutorialsRepository tutRepo;

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<List<Tutorial>> getAllTutorialWithID(@PathVariable("id") long id) {
        System.out.println("getAllTutorialWithID");
      return  ResponseEntity.status(HttpStatus.OK).body(tutRepo.findByTitleContaining(id));
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials() {
        System.out.println("getAllTutorials");
        return  ResponseEntity.status(HttpStatus.OK).body(tutRepo.findAll());
    }

}
