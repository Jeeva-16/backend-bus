package com.example.Guvi_Bus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Guvi_Bus.Entity.UserBusEntity;
@Repository

public interface UserBusRepository extends JpaRepository<UserBusEntity,Long>{
	
	

}
