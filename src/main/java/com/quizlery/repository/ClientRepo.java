package com.quizlery.repository;

import com.quizlery.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {
    Optional<Client> findByUsername(String username);
}
