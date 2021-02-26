package com.humanbooster.examRestFayolleAlexandre.repo;

import com.humanbooster.examRestFayolleAlexandre.model.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends CrudRepository<Color,Long> {
    @Override
    List<Color> findAll();
}
