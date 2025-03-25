package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "user")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String age;
    private String sex;
    private String address;
    @Column(name = "create_time")
    private String createTime;
    private String phone;

}
