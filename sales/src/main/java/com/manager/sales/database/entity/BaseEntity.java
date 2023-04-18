package com.manager.sales.database.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

/**
 * private static final long serialVersionUID = -3398400026267104175L;
 *
 * @author thucnc
 * @date 2023/04/18
 * */
@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1897413211225884241L;

    @Column(name = "add_user", nullable = false)
    private String add_user;

    @CreatedDate
    @Column(name = "create_date", updatable = false, nullable = false)
    private Instant create_date = Instant.now();

    @Column(name = "update_date", nullable = false)
    private Instant update_date = Instant.now();

    @Column(name = "version_update")
    private int version_update;

    @Column(name = "cancel_date")
    private Instant cancel_date = Instant.now();
}
