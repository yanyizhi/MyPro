package com.yyz.dao;

import com.yyz.entity.Person;

import java.util.List;

public interface PersonDao {

    List<Person> find(Integer id);

    Integer del(Integer id);

    Integer edit(Person person);

    Integer add(Person person);

    Person login(Person person);

}
