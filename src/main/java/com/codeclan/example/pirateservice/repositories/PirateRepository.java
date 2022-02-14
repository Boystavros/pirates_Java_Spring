package com.codeclan.example.pirateservice.repositories;

import com.codeclan.example.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PirateRepository extends JpaRepository<Pirate, Long> {



}
