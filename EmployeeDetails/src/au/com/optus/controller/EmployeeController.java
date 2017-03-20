package au.com.optus.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import au.com.optus.dto.EmployeeBean;

@Controller
public class EmployeeController {
	
	String jsonList;
	ObjectMapper mapper=new ObjectMapper();
	private static List<EmployeeBean> empList = new ArrayList<EmployeeBean>();
	
	static {
	empList.add(new EmployeeBean("111", "Nanda", "25000", "Hyderabad"));
	empList.add(new EmployeeBean("222", "Kishore", "35000", "Banglore"));
	}
	
	@RequestMapping("/viewAllEmployees")
	public ModelAndView viewAllEmployees(){
		
		System.out.println("1:EmployeeController::viewAllEmployees::: " );
		
		try {
			
			System.out.println("2:EmployeeController::viewAllEmployees::: " + jsonList);
			
			jsonList = mapper.writeValueAsString(empList);
			
			System.out.println("3:EmployeeController::viewAllEmployees::: " + jsonList);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("viewEmployees","empList",jsonList);
	}
	
	@RequestMapping("/viewEmployee/{empoyeeName}")
	public ModelAndView viewEmployee(@PathVariable String empoyeeName){
		
		System.out.println("1:EmployeeController::viewEmployee::: " + empoyeeName);
		
		for(EmployeeBean emp:empList){
			
			System.out.println("2:EmployeeController::viewEmployee: form List ::: " + emp.getEmpoyeeName());
			System.out.println("3:EmployeeController::viewEmployee: user entered ::: " + empoyeeName);
			
			if(emp.getEmpoyeeName().equals(empoyeeName)){
				try {
					
					System.out.println("4:EmployeeController::viewEmployee::both are equal . inside if condtion ");
					System.out.println("5:EmployeeController::viewEmployee::jsonList  Before::: " + jsonList );
					
					jsonList = mapper.writeValueAsString(emp);
					
					System.out.println("6 EmployeeController::viewEmployee::jsonList  After  ::: " + jsonList );
				} catch (JsonGenerationException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return new ModelAndView("viewEmployee","empList",jsonList);
	}
	
}
