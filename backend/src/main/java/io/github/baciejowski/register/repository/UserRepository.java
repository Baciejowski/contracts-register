package io.github.baciejowski.register.repository;

import io.github.baciejowski.register.model.User;
import org.springframework.data.repository.Repository;


public interface UserRepository extends Repository<User, Integer> {
}
