package com.example.Guvi_Bus.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Guvi_Bus.Dto.BusDto;
import com.example.Guvi_Bus.Entity.BusEntity;
@Component
public class BusMapper {
	public static BusDto mapToBusDto(BusEntity busEntity) {
		
		BusDto busDto = new BusDto();
        BeanUtils.copyProperties(busEntity, busDto);
		
		return busDto;
	}
	
	public static BusEntity mapToBusEntity(BusDto busDto) {
		BusEntity busEntity = new BusEntity();
		BeanUtils.copyProperties(busDto, busEntity);
        
		
		return busEntity;
		
	
	}

}
