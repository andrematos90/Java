package com.projeto.userdepartment.repositories;

import com.projeto.userdepartment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
