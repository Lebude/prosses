package com.impl;

import com.entity.Building;
import com.repository.BuildingRepository;
import com.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    BuildingRepository buildingRepository;

    @Override
    public Building insert(Building building) {
        return buildingRepository.save(building);
    }

    @Override
    public void delete(Building building) {
        buildingRepository.delete(building);

    }

    @Override
    public void update(Building building) {
        buildingRepository.save(building);

    }

    @Override
    public List<Building> getBuildingByBuildingFloors(String floors) {
        return buildingRepository.findBuildingByBuildingFloors(floors);
    }



}
