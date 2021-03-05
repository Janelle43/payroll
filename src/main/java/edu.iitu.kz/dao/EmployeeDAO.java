package edu.iitu.kz.dao;

import edu.iitu.kz.entity.Employee;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeDAO implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;
    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";
private static Connection connection;

static {
    try {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
}
public List<Employee> index(){
List<Employee> worker = new ArrayList<Employee>();
    try {
        Statement statement = connection.createStatement();
        String SQL = "SELECT * FROM Employee";
        ResultSet resultSet = statement.executeQuery(SQL);

        while (resultSet.next()){
            Employee employee = new Employee();
            employee.setId(resultSet.getInt("id"));
            employee.setName(resultSet.getString("name"));
            employee.setId(resultSet.getInt("salary"));
                 worker.add(employee);
        }


    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    return worker;
}
public void save(Employee employee){
    try {
        Statement statement = connection.createStatement();
        String SQL = "INSERT INTO";
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
}

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
