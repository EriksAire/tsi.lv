package com.aire.House.Repository;

import com.aire.House.Models.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IHouseRepository extends JpaRepository<House, Integer> {
}
