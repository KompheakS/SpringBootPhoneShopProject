package com.kompheak.java.phoneShop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Integer id;
    @Column()
    private String name;

    @Column()
    @ManyToOne
    private Brand brand;
}
