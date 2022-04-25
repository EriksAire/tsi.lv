package com.aire.House.Controllers;

import com.aire.House.Models.House;
import com.aire.House.Services.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HouseController {
    private final HouseService houseService;

    @GetMapping("/info")
    public ResponseEntity<String> Info(){
        return ResponseEntity.ok("Eriks Aire\n 4001BDA\n 3variant\n 25.04.2022");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<House>> getAllHouses(){
        return houseService.GetHouses();
    }

    @GetMapping("/get")
    public ResponseEntity getHouseById(@RequestParam(name="id") Integer id){
        return houseService.getHouseById(id);
    }

    @GetMapping("/totalprice")
    public ResponseEntity GetTotalHousePrices(){
        return houseService.CalculateTotalHousePrices();
    }
}
