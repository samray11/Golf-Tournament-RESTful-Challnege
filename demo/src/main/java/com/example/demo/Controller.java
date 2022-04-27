package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class Controller {

    @Autowired
    private Golf_tournament_type_1Repo golfRepo;

    @GetMapping("/")
    public String getPage(){
        return "Welcome, use /save to enter json";
    }

    @GetMapping("/tournaments")
    public List<Golf_tournament_type_1> getDataType1(){
        return golfRepo.findAll();
    }
    
    @PostMapping(value ="/save")
    public String saveGolf(@RequestBody Golf_tournament_type_1 golf_tournament_type_1){
        try {
            golfRepo.save(golf_tournament_type_1);
            return "record saved";
        }catch(Exception e){
            return e.toString();        }
    }
    
}
