package com.controller;
import com.entity.Building;
import com.entity.Building_design;
import com.service.Building_designService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "building_design")
public class Building_designController {

    @Autowired
    Building_designService building_designService;

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Building_design> insert(@RequestBody @Valid Building_design building_design) {
        building_designService.insert(building_design);
        return new ResponseEntity<>(building_design, HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Building_design> update(@RequestBody @Valid Building_design building_design) {
        building_designService.insert(building_design);
        return new ResponseEntity<>(building_design, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(int id) {
        building_designService.delete(id);
    }

    @RequestMapping(value = "/designers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Building_design> getBuilding_designByDesigners(@RequestBody @Valid String designers) {
        Building_design building_design=building_designService.getBuilding_designByDesigners(designers);
        return   new ResponseEntity<>(building_design, HttpStatus.OK);
    }

    @RequestMapping(value = "/topologies", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getBuilding_designByTopologies(String topologies) {
        return building_designService.getBuilding_designByTopologies(topologies);
    }

    @RequestMapping(value = "/component", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getBuilding_designByComponent(String component) {
        return building_designService.getBuilding_designByComponent(component);
    }
}