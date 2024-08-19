package com.example.demo_csw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "class_room")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_class;
    private String class_name;
    private String number_member;

    public Classroom() {
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public String getNumber_member() {
        return number_member;
    }

    public void setNumber_member(String number_member) {
        this.number_member = number_member;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "class_name='" + class_name + '\'' +
                ", id_class=" + id_class +
                ", number_member='" + number_member + '\'' +
                '}';
    }
}
