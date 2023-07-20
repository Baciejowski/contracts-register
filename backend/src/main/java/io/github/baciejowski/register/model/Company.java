package io.github.baciejowski.register.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;


//TODO implement model
@MappedSuperclass
@Data
public abstract class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
