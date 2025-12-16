package com.example.jenklinsdemo;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface DataModelRepo extends ListCrudRepository<DataModel, Long> {
}
