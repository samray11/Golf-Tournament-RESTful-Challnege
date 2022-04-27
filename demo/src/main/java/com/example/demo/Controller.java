package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 
import java.util.List;

import javax.annotation.Nullable;
@RestController
public class Controller {

    @Autowired
    private Golf_tournament_type_1Repo golfRepo;

    @Autowired
    private Golf_tournament_type_2Repo golfRepo2;

    @GetMapping("/")
    public String getPage(){
        return "Welcome, use /save to enter json";
    }

    @GetMapping("/tournaments")
    public List<Golf_tournament_type_1> getDataType1(){
        return golfRepo.findAll();
    }
     /*
    @RequestMapping(value ="/save")
    public  Golf_tournament_type_1 saveGolf(@RequestBody Golf_tournament_type_1 golf_tournament_type_1) throws JsonProcessingException{
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(golf_tournament_type_1);
        System.out.println("-------------------------------"+json);
        golfRepo.save(golf_tournament_type_1);
        return golf_tournament_type_1;
    }
    */
    @RequestMapping(value ="/save")
    public String saveGolf(@RequestBody @Nullable Golf_tournament_type_1 golf_tournament_type_1,@Nullable Golf_tournament_type_2 golf_tournament_type_2 ) throws JsonProcessingException{
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        if (golf_tournament_type_1.getTournamentID() > 0){
            String json = ow.writeValueAsString(golf_tournament_type_1);
            golfRepo.save(golf_tournament_type_1);
            System.out.println(json);
            return "saved...."+json;
        }
        else if(golf_tournament_type_2.getTournamentUUID() != null){
            String json = ow.writeValueAsString(golf_tournament_type_2);
            golfRepo2.save(golf_tournament_type_2);
            System.out.println(json);
            return "saved..."+json;
        }
        else{
            return"No Data saved";
        }
    }
}
