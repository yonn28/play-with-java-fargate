package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao persondao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        persondao = personDao;
    }

    public int addPerson(Person person){
        return persondao.insertPerson(person);
    }
    public List<Person> getAllPeople(){
        return persondao.selectAllPeople();
    }
    public Optional getPersonById(UUID id){
        return persondao.selectPersonById(id);
    }
    public int deletePerson(UUID id){
        return persondao.deletePersonById(id);
    }
    public int updatePerson(UUID id, Person newPerson){
        return persondao.updatePersonById(id,newPerson);
    }

}
