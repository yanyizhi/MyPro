package com.yyz.controller;

import com.yyz.dao.PersonDao;
import com.yyz.entity.Person;
import com.yyz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@Controller
public class PersonController {

    @Resource
    PersonService personService;

    @RequestMapping("find")
    @ResponseBody
    public  Object find(Integer id){
        List<Person> person = personService.find(id);
        return person;
    }

    @RequestMapping("sele")
    public String sele(Model model, Integer id){
        List<Person> people = personService.find(id);
        model.addAttribute("person",people);
        return "Person";
    }

    @RequestMapping("person")
    public String tiao(){
        return "Person";
    }

    @RequestMapping("edit")
    public String edit(Person person){
        personService.edit(person);
        return "redirect:find";
    }

    @RequestMapping("upd")
    @ResponseBody
    public Object upd(@RequestBody Person person){
        System.out.println("修改内容："+person);
        personService.edit(person);
        return person;
    }

    @RequestMapping("add")
    public String add(Person person){
        System.out.println(person);
        personService.add(person);
        System.out.println(person);
        return "redirect:find";
    }

    @RequestMapping("asss")
    @ResponseBody
    public Object addper(@RequestBody Person person){
        personService.add(person);
        System.out.println(person);
        return person;
    }

    @RequestMapping("del")
    public String del(Integer id){
        personService.del(id);
        return "redirect:find";
    }

    @RequestMapping("Login")
    @ResponseBody
    public Person login(@RequestBody Person person){
        System.out.println(person.toString());
        Person personList = personService.login(person);
        return personList;
    }


}
