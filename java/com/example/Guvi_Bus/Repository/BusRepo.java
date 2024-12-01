package com.example.Guvi_Bus.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Guvi_Bus.Entity.BusEntity;
@Repository
public interface BusRepo extends JpaRepository<BusEntity,Long> {
     @Query("SELECT DISTINCT startingPoint FROM BusEntity")
     List<String> findByStartingPoint();
     
     @Query("SELECT  DISTINCT destination FROM BusEntity")
     List<String> findByDestination();
     
  @Query("SELECT b FROM BusEntity b WHERE b.startingPoint = :sp AND b.destination = :d")
     List<BusEntity> findBusByRoutes(@Param("sp")String startingPoint , @Param("d")String destination);
}