package com.example.demo.Repository;

import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface userRepository extends JpaRepository<user, String> {

    List findAllById(Integer id);
}
