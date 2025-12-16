package com.example.jenklinsdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/data/all")
    public void deleteAllDataModel(){
        repo.deleteAll();
    }

}
