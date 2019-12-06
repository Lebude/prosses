package com.impl;

import com.entity.Employee;
import com.entity.Position;
import com.repository.PositionRepository;
import com.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public  void insert(Position position) {
         positionRepository.save(position);
    }

    @Override
    public void delete(Position position) {
        positionRepository.delete(position);

    }

    @Override
    public void update(Position position) {
        positionRepository.save(position);

    }

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.findAllPosition();
    }

    @Override
    public List<String> getPositionMinSalary(double minSalary) {
        return positionRepository.findPositionMinSalary(minSalary);
    }
}
