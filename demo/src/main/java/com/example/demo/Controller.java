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
    public String getPage() {
        return "Welcome, use /save to enter json";
    }

    @GetMapping("/tournaments")
    public List<Golf_tournament_type_1> getDataType1() {
        return golfRepo.findAll();
    }

    @RequestMapping(value = "/save")
    public String saveGolf(@RequestBody String data) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Golf_tournament_type_1 golf1 = objectMapper.readValue(data, Golf_tournament_type_1.class);
            golfRepo.save(golf1);
            return "saved..." + data;
        } catch (JsonProcessingException e) {
        }
        try {
            Golf_tournament_type_2 golf2 = objectMapper.readValue(data, Golf_tournament_type_2.class);
            golfRepo2.save(golf2);
            return "saved..." + data;
        } catch (JsonProcessingException e) {
        }
        return "No data saved to database";
    }
}
