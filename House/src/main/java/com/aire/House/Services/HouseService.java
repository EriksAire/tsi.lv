package com.aire.House.Services;

import com.aire.House.Models.House;
import com.aire.House.Repository.IHouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class HouseService {
    private final IHouseRepository houseRepository;

    public ResponseEntity<List<House>> GetHouses(){
        return ResponseEntity.ok(houseRepository.findAll());
    }

    public ResponseEntity<Object> getHouseById(Integer id) {
        var house = houseRepository.findById(id);

        if(house.isPresent()) {
            return ResponseEntity.ok(house.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    public ResponseEntity<Double> CalculateTotalHousePrices(){
        var houses = houseRepository.findAll();

        var sum = houses.stream().mapToDouble(x->x.getPrice()).sum();

        return ResponseEntity.ok(sum);
    }
}
