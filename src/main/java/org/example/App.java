package org.example;

import org.example.config.MyConfig;
import org.example.models.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{ public static void main( String[] args ) {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);

    Communication communication = context.getBean("communication",Communication.class);

    /*List<Employee> allEmployees = communication.getAllEmployees();
    Employee employee = communication.getEmployee(24);

    System.out.println(allEmployees);
    System.out.println(employee);*/

 /*   Employee employee = new Employee("Adil", "Saparov", "HR",1000);
    communication.saveEmployee(employee);*/

    communication.deleteEmployee(24);
    }
}
