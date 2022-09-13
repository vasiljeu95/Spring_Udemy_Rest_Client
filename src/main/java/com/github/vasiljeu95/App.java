package com.github.vasiljeu95;

import com.github.vasiljeu95.configuration.MyConfig;
import com.github.vasiljeu95.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * App
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployees(14);
//        System.out.println(empByID);

//        Employee employee = new Employee("Svetlana", "Konushkan", "Support Head", 900);
//        employee.setId(14);
//        communication.saveEmployees(employee);

        communication.deleteEmployees(14);
    }
}
