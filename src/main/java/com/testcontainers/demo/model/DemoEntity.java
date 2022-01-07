package com.testcontainers.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "demo")
public class DemoEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String text;

    private Integer number;

}
