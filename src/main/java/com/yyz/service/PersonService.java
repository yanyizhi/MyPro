package com.yyz.service;

import com.yyz.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> find(Integer id);
    Integer edit(Person person);
    Integer add(Person person);
    Integer del(Integer id);

    Person login(Person person);

}
