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
public class SubmarineController extends GlobalController{

    private static final String SUBMARINE_URL = API_VERSION + "/submarine";
    private static final String SUBMARINE_PUT_DELETE_URL = SUBMARINE_URL + "/{id}";

    @Autowired
    private SubmarineService submarineService;

    @PostMapping(SUBMARINE_URL)
    public ResponseEntity<Submarine> saveSubmarine(@RequestBody Submarine submarine){
        return new ResponseEntity<>(submarineService.saveSubmarine(submarine), HttpStatus.CREATED);
    }

    @PutMapping(SUBMARINE_PUT_DELETE_URL)
    public ResponseEntity<Submarine> updateSubmarine(@PathVariable Long id, @RequestBody Submarine submarine){
        Submarine s = new Submarine(id, submarine.getName(), submarine.getSubmarineClass(), submarine.getOps());
        return new ResponseEntity<>(submarineService.updateSubmarine(s), HttpStatus.OK);
    }

    @DeleteMapping(SUBMARINE_PUT_DELETE_URL)
    public ResponseEntity<String> deleteSubmarine(@PathVariable Long id){
        submarineService.deleteSubmarine(id);
        return new ResponseEntity<>("the submarine with id " + id + "has been deleted", HttpStatus.OK);
    }

    @GetMapping(SUBMARINE_URL)
    public ResponseEntity<Submarine> getAllSubmarines(){
        return new ResponseEntity(submarineService.getAllSubmarines(), HttpStatus.OK);
    }
}
