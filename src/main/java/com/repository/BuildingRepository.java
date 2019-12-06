package com.repository;
import com.entity.Building;
import java.util.List;


public interface BuildingRepository {
    Building save(Building building);
    void delete(Building building);
    List<Building> findBuildingByBuildingFloors(String floors);
}