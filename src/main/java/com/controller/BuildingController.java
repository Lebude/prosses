package com.controller;

import com.entity.Building;
import com.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/building")
public class BuildingController {

    @Autowired
    BuildingService buildingService;


    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(Building building) {
        buildingService.delete(building);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Building> update(@RequestBody @Valid Building building) {
        buildingService.update(building);
        return new ResponseEntity<>(building, HttpStatus.OK);
    }
    @RequestMapping(value = "/buildingFloors", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Building> getBuildingByBuildingFloors(String floors) {
        return (List<Building>) buildingService.getBuildingByBuildingFloors(floors);
    }

}
