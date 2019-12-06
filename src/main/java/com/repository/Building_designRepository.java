package com.repository;

import com.entity.Building_design;

import java.util.List;

public interface Building_designRepository {
    void save(Building_design building_design);
    void delete(int id);
    Building_design findBuilding_designByDesigners(String designers);
    List<String> findBuilding_designByTopologies(String topologies);
    List<String> findBuilding_designByComponent(String component);
}
