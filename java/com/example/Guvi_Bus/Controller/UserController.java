package com.example.Guvi_Bus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Guvi_Bus.Dto.UserBusDto;
import com.example.Guvi_Bus.Dto.UserDto;
import com.example.Guvi_Bus.Entity.BusEntity;
import com.example.Guvi_Bus.Service.BusService;
import com.example.Guvi_Bus.Service.UserBusService;
import com.example.Guvi_Bus.Service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping
	public ResponseEntity<UserDto> createUser(@RequestBody @Valid UserDto userDto){
		
		
		return new ResponseEntity<>(userService.createUser(userDto) , HttpStatus.CREATED);
		
		
	}
	
	
	@GetMapping("/register")
	public String showRegForm(Model model) {
		UserDto userDto = new UserDto();
		model.addAttribute("userDto", userDto);
		
		return "register";
	}
	  @GetMapping("/index")
	    public String home() {
	        return "index";
	    }

	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }
	    @PostMapping("/register/save")
	    public String registration(@Valid @ModelAttribute("userDto") UserDto userDto,
	                               BindingResult result,
	                               Model model) {
	    userService.createUser(userDto);
        return "redirect:/register?success";
    }

@Autowired
	private BusService busService;
	
	@GetMapping("/search")
	public String getSearch(Model model) {
		List<String> dropdownOptions = busService.getDropdownOptions();
		 model.addAttribute("dropdownOptions", dropdownOptions);
		 List<String> dropdownOption = busService.getDropdownOption();
			model.addAttribute("dropdownOption" , dropdownOption);
	        return "search";
	}
	
	@GetMapping("/results")
    public String searchBuses(
        @RequestParam String startingPoint,
        @RequestParam String destination,
        Model model) {
		 List<BusEntity> BusDetails = busService.searchBuses(startingPoint, destination);
	        model.addAttribute("busDetails", BusDetails);
	        return "results";
	}
	@Autowired
	private UserBusService userBusService;
	@PostMapping("/results/save")
	public String result(@ModelAttribute("userBusDto") UserBusDto userBusDto, Model model) {
	  userBusService.saveUser(userBusDto)	;
	  return "redirect:/index?success";
	}
	
	
	
	

	

}
