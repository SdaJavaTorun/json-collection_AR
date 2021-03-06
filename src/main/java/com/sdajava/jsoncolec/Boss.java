package com.sdajava.jsoncolec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boss {

    private Integer id;
    private String firstName;
    private String lastName;
    private Map<Integer, List<Employee>> map = new HashMap<>();

    public Boss(Integer id, String firstName, String lastName,
                Map<Integer, List<Employee>> workers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.map = workers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
