package com.controller;

import com.entity.Employee;
import com.entity.Position;
import com.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/controller")
public class PositionController {
    @Autowired
    PositionService positionService;

    @RequestMapping("positions")
    public List<Position> getAllPosition() {
        return positionService.getAllPosition();
    }

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Position> insert(@RequestBody @Valid Position position) {
        positionService.insert(position);
        return new ResponseEntity<>(position, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(Position position) {
        positionService.delete(position);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Position> update(@RequestBody @Valid Position position) {
        positionService.update(position);
        return new ResponseEntity<>(position, HttpStatus.OK);
    }

    @RequestMapping(value = "/minSalary", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getPositionMinSalary(double minSalary) {
        return positionService.getPositionMinSalary(minSalary);

    }

}
