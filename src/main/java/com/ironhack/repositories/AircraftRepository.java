package com.ironhack.repositories;

import com.ironhack.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftRepository extends JpaRepository <Aircraft, String>{

    List<Aircraft> findByModelLike(String modelLike);

}
