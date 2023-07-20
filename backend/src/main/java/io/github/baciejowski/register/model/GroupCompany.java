package io.github.baciejowski.register.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


//TODO implement model
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class GroupCompany extends Company {
}
