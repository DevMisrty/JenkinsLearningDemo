package com.example.jenklinsdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DataModelController {

    private DataModelRepo repo;

    @PostMapping("/data")
    public DataModel addDataModel(@RequestBody DataModel data){
        return repo.save(data);
    }

    @GetMapping("/data/all")
    public List<DataModel> getAllDataModel(){
        return repo.findAll();
    }

}
