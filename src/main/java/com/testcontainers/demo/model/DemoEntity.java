package com.testcontainers.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class DemoEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String text;

    private Integer number;

}
