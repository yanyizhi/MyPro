package com.yyz.service.impl;


import com.yyz.dao.PersonDao;
import com.yyz.entity.Person;
import com.yyz.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonDao personDao;

    @Override
    public List<Person> find(Integer id) {
        return personDao.find(id);
    }

    @Override
    public Integer edit(Person person) {
        return personDao.edit(person);
    }

    @Override
    public Integer add(Person person) {
        return personDao.add(person);
    }

    @Override
    public Integer del(Integer id) {
        return personDao.del(id);
    }

    @Override
    public Person login(Person person) {
        return personDao.login(person);
    }
}
