package com.submarine.controller;

import com.submarine.model.Submarine;
import com.submarine.service.SubmarineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hamza Amentag
 * @since 3/16/2022
 */
@RestController
public class SubmarineController {

    @Autowired
    private SubmarineService submarineService;

    @PostMapping("/submarine")
    public ResponseEntity<Submarine> saveSubmarine(@RequestBody Submarine submarine){
        return new ResponseEntity<>(submarineService.saveSubmarine(submarine), HttpStatus.CREATED);
    }

    @PutMapping("/submarine")
    public ResponseEntity<Submarine> updateSubmarine(@RequestBody Submarine submarine){
        return new ResponseEntity<>(submarineService.updateSubmarine(submarine), HttpStatus.OK);
    }

    @DeleteMapping("/submarine/{id}")
    public ResponseEntity<String> deleteSubmarine(@PathVariable Long id){
        submarineService.deleteSubmarine(id);
        return new ResponseEntity<>("the submarine with id " + id + "has been deleted", HttpStatus.OK);
    }

    @GetMapping("/submarine")
    public ResponseEntity<Submarine> getAllSubmarines(){
        return new ResponseEntity(submarineService.getAllSubmarines(), HttpStatus.OK);
    }
}
