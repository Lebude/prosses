package com.impl;

import com.entity.Building_design;
import com.repository.Building_designRepository;
import com.service.Building_designService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Building_designServiceImpl implements Building_designService {

    @Autowired
    Building_designRepository building_designRepository;

    @Override
    public void insert(Building_design building_design) {
        building_designRepository.save(building_design);

    }

    @Override
    public void update(Building_design building_design) {
        building_designRepository.save(building_design);
    }

    @Override
    public void delete(int id) {
       building_designRepository.delete(id);
    }

    @Override
    public Building_design getBuilding_designByDesigners(String designers) {
        return building_designRepository.findBuilding_designByDesigners(designers);
    }

    @Override
    public List<String> getBuilding_designByTopologies(String topologies) {
        return building_designRepository.findBuilding_designByTopologies(topologies);
    }

    @Override
    public List<String> getBuilding_designByComponent(String component) {
        return building_designRepository.findBuilding_designByComponent(component);
    }


}
