package com.example.Guvi_Bus.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Guvi_Bus.Dto.UserBusDto;
import com.example.Guvi_Bus.Entity.UserBusEntity;
@Component
public class UserBusMapper {
	
public static UserBusDto mapToUserBusDto(UserBusEntity userBusEntity) {
		
		UserBusDto userBusDto = new UserBusDto();
        BeanUtils.copyProperties(userBusEntity, userBusDto);
		
		return userBusDto;
	}
	
	public static UserBusEntity mapToUSerBusEntity(UserBusDto userBusDto) {
		UserBusEntity userBusEntity = new UserBusEntity();
		BeanUtils.copyProperties(userBusDto, userBusEntity);
        
		
		return userBusEntity;
		
	
	}

}
