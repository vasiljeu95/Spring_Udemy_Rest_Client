package com.github.vasiljeu95;

import com.github.vasiljeu95.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Communication
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/Spring_Udemy_Rest/api/employees/";

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {});
        List<Employee> allEmployee = responseEntity.getBody();

        return allEmployee;
    }

    public Employee getEmployees (int id) {
        Employee employee = restTemplate.getForObject(URL + "/" + id, Employee.class);

        return employee;
    }

    public void saveEmployees (Employee employee) {
        int id = employee.getId();

        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New employee was added to DB");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL, employee);
            System.out.println("Employee with ID " + id + " was updated");
        }
    }

    public void deleteEmployees (int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("Employee with ID " + id + " was deleted");
    }

}
