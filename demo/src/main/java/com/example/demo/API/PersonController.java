package com.example.demo.API;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.util.annotation.NonNull;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson(@RequestBody @NonNull Person person){

        personService.addPerson(person);
    }
    @GetMapping
    public List<Person> getAllPeople(){

        return personService.getAllPeople();
    }
    @GetMapping(path="{id}")
    public Object getPersonById(@PathVariable("id") UUID id){

        return personService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id){

        personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id,  @NonNull  @RequestBody Person personToUpdate){
        personService.updatePerson(id,personToUpdate);
    }

}


