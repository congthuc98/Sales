package com.manager.sales.database.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.Instant;

/**
 * Table information
 *
 * @author thucnc
 * @date 2023/04/18
 * */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "information")
public class Information extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3398400026267104175L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "hashpass", nullable = false)
    private String hashpass;

    @Column(name = "image")
    private String image;

    @Column(name = "address")
    private String address;

    @Column(name = "date_of_birth", nullable = false)
    private Instant date_of_birth = Instant.now();

}
