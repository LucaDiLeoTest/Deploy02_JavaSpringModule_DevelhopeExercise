package co.develhope.deploy2.controllers;

import co.develhope.deploy2.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController{

    @Autowired
    BasicService basicService;
    @GetMapping("")
    public ResponseEntity<Integer> getSumRandom(){
        return ResponseEntity.ok(basicService.getSum());        //all the sum logic it's in the service
    }
}