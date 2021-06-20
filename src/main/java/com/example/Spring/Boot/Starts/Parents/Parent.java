package com.example.Spring.Boot.Starts.Parents;

import javax.persistence.*;

@Entity
@Table
public class Parent {
    @Id
    @SequenceGenerator(
            name="parent_sequence",
            sequenceName = "parent_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="parent_sequence"
    )
    private Long id;
    private String name;
    private String lastName;

    public Parent(){};

    public Parent(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
