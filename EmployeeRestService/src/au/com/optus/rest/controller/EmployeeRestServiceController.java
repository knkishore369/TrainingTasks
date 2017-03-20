package au.com.optus.rest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import au.com.optus.rest.dto.EmployeeRestBean;

@Controller
public class EmployeeRestServiceController {
	
	
	String jsonList;
	static List<EmployeeRestBean> empList = new ArrayList<EmployeeRestBean>();
	ObjectMapper mapper = new ObjectMapper();
	
	static{
		empList.add(new EmployeeRestBean("111","Nanda","25000"));
		empList.add(new EmployeeRestBean("222","Kishore","26000"));
	}
	
	@RequestMapping("/rest/viewAllEmployees")
	public @ResponseBody String getAllEmloyees() throws JsonGenerationException, JsonMappingException, IOException{
		
		jsonList = mapper.writeValueAsString(empList);
		
		return jsonList;
	}
	
	@RequestMapping("/rest/viewAllEmployee/{empName}")
	public @ResponseBody String getEmployee(@PathVariable String empName) throws JsonGenerationException, JsonMappingException, IOException{
		
		for(EmployeeRestBean emp:empList){
			
			if(emp.getEmpName().equals(empName)){
				jsonList = mapper.writeValueAsString(emp);
			}
		}
		return jsonList;
	}
	
}
