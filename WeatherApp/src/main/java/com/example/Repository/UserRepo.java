package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	User findByEmail(String email);

	Optional<User> findOneByEmailAndPassword(String email, String password);

}
