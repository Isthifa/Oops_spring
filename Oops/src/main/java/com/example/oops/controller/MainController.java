package com.example.oops.controller;

import com.example.oops.abstra.Circle;
import com.example.oops.abstra.Rectangle;
import com.example.oops.abstra.Shape;
import com.example.oops.interfac.Employee;
import com.example.oops.interfac.EmployeeD;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oops")
public class MainController {

    @GetMapping("/shape/{type}")
    public Shape getshape(@PathVariable String type)
    {
        if(type.equals("circle"))
        {
            Circle c=new Circle();
            c.setRadius(5.0);
            return c;
        }
        else if(type.equals("rect"))
        {
            Rectangle r=new Rectangle();
            r.setLength(11.2);
            r.setWidth(10.0);
            return  r;
        }
        else
        {
            throw new RuntimeException("Invaild input");
        }
    }

    @GetMapping("/inheri/{etype}")
    public Employee getdetails(@PathVariable String etype)
    {
        if(etype.equals("e1"))
        {
            EmployeeD e1=new EmployeeD();
            e1.setAge(24);
            e1.setName("isthifa");
            return e1;
        }
        else if(etype.equals("e2"))
        {
            EmployeeD e2=new EmployeeD();
            e2.setName("new user");
            e2.setAge(35);
            return e2;
        }
        else
        {
            throw new RuntimeException("Invalid input");
        }
    }
    //Polymorphism - method overloading -
    @GetMapping("/add/{id1}/{id2}")
    public int add(@PathVariable int id1, @PathVariable int id2)
    {
        int result =id1+id2;
        return result;
    }
    @GetMapping("/string/{a1}/{a2}")
    public String add(@PathVariable String a1, @PathVariable String a2)
    {
        String a=a1+a2;
        return a;
    }
}
