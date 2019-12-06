package com.service;

import com.entity.Building;

import java.util.List;

public interface BuildingService {
    Building insert(Building building);
    void delete(Building building);
    void update(Building building);
    List<Building> getBuildingByBuildingFloors(String floors);

}
