package com.service;

import com.entity.Building_design;

import java.util.List;

public interface Building_designService {
    void insert(Building_design building_design);
    void update(Building_design building_design);
    void delete(int id);
    Building_design getBuilding_designByDesigners(String designers);
    List<String>getBuilding_designByTopologies(String topologies);
    List<String>getBuilding_designByComponent(String component);

}
