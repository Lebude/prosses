package com.repository;
import com.entity.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PositionRepository  {
    List<String> findPositionMinSalary(double minSalary);
    List<Position> findAllPosition();

    void save(Position position);

    void delete(Position position);
}
