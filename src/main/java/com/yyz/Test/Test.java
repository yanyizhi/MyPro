package com.yyz.Test;

import com.yyz.entity.Person;
import com.yyz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Test {
    @Resource
    PersonService personService;


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("流星1aa11" +
                "ssss");
        person.setPhone(1586451564);


    }
}
