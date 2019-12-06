package com.service;

import com.entity.Employee;
import com.entity.Position;

import java.util.List;

public interface PositionService {
    void insert(Position position);
    void delete(Position position);
    void update(Position position);
    List<Position> getAllPosition();
    List<String> getPositionMinSalary(double minSalary);
}

