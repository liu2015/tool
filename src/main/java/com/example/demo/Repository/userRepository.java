package com.example.demo.Repository;

import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, String> {

}
