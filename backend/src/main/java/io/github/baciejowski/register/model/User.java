package io.github.baciejowski.register.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


//TODO implement model
@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
