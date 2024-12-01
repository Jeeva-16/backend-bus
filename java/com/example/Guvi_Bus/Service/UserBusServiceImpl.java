package com.example.Guvi_Bus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Guvi_Bus.Dto.UserBusDto;
import com.example.Guvi_Bus.Entity.UserBusEntity;
import com.example.Guvi_Bus.Mapper.UserBusMapper;
import com.example.Guvi_Bus.Repository.UserBusRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserBusServiceImpl implements UserBusService {
   @Autowired
	private UserBusRepository userBusRepository;
	@Autowired
	private UserBusMapper userBusMapper;
	@Override
	public UserBusDto saveUser(UserBusDto userBusDto) {
		UserBusEntity userBusEntity = userBusMapper.mapToUSerBusEntity(userBusDto);
		UserBusEntity savedUser = userBusRepository.save(userBusEntity);
      UserBusDto returnedBusDto = userBusMapper.mapToUserBusDto(userBusEntity);
      return returnedBusDto;	
	}
	
	
	
	
}
