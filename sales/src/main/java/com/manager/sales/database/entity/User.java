package com.manager.sales.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * Table user
 *
 * @author thucnc
 * @date 2023/04/18
 */
@Entity
@Table(name = "user")
@Data
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1400999034554607088L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "salt", nullable = false)
    private String salt;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private int role;

}
