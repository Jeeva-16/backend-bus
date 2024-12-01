package com.example.Guvi_Bus.Mapper;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Guvi_Bus.Dto.UserDto;
import com.example.Guvi_Bus.Entity.UserEntity;
@Component
public class UserMapper {
	public static UserDto mapToUserDto(UserEntity userEntity) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userEntity, userDto);
		
		return userDto;

	}
	
	public static UserEntity mapToUserEntity(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
        
		
		return userEntity;
		
	
	}

}
