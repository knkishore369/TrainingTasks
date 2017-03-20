package au.com.optus.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.servlet.ModelAndView;
import static org.junit.Assert.assertNotNull;

public class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;
	
	@Mock
	ObjectMapper mapper=new ObjectMapper();
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void viewAllEmployees() throws JsonGenerationException, JsonMappingException, IOException{
		
		String jsonList = "[{'employeeId':'3','empoyeeName':'3','employeeSalary':'3','employeeLocation':'3'}," +
				"{'employeeId':'4','empoyeeName':'4','employeeSalary':'4','employeeLocation':'4'}]";
		
		when(mapper.writeValueAsString(any(ArrayList.class))).thenReturn(jsonList);
		
		ModelAndView modelAndView = employeeController.viewAllEmployees();
		
		System.out.println("modelAndView" + modelAndView);
		
		String jsonString= modelAndView.getModel().get("empList").toString();
		
		System.out.println("jsonString---> " + jsonString);
		
		assertNotNull(modelAndView);
		assertNotNull(jsonString);
		assertNotNull(modelAndView.getModel());
		
	}
	
	
}
