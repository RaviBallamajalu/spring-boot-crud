package com.ravi.springbootcrud.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="STUDENT")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name="STUDENT_NAME")
    private String name;

    @Column(name="MOBILE_NUMBER")
    private Long mobileNumber;

    @Column(name="EMAIL")
    private String emailId;

    @Column(name="SECTION")
    private String section;

}
