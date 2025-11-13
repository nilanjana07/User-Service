package com.learnSpring.userService.repository;
import com.learnSpring.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface UserRepository extends JpaRepository<User, Long> {
}
