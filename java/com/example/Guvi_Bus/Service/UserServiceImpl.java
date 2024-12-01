package com.example.Guvi_Bus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Guvi_Bus.Dto.UserDto;
import com.example.Guvi_Bus.Entity.UserEntity;
import com.example.Guvi_Bus.Mapper.UserMapper;
import com.example.Guvi_Bus.Repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		UserEntity userEntity = userMapper.mapToUserEntity(userDto);
		UserEntity ouserEntity = userRepository.findByEmail(userDto.getEmail());
		 
        UserEntity savedUser = userRepository.save(userEntity);
//        UserDto returnedDto = UserMapper.mapToUserDto(savedUser);
        UserDto returnedDto = userMapper.mapToUserDto(userEntity);
        return returnedDto;	
        }
	
	

	
}
