package com.mvpProjectNalan.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.codehaus.jettison.json.JSONObject;

import com.mvpProjectNalan.model.Employee;
import com.mvpProjectNalan.model.Employee_details;
import com.mvpProjectNalan.model.Employee_detailscpy;
import com.mvpProjectNalan.model.LeaveDetails;
import com.mvpProjectNalan.service.NalanService;
import com.mvpProjectNalan.service.NalanServiceImpl;

@Path("/employee")
public class NalanConroller {
	
	NalanService nalanService = new NalanServiceImpl();

	
	@Path("/auth")
	@POST
	@Consumes("application/json")
	public String authUserByEmail( Employee employee1
			) throws Exception
	{
		String email=employee1.getEmail();
		String pwd=employee1.getPassword();
		Employee employee = nalanService.findUserByEmail(email,pwd);
		
		String response="";
		JSONObject jsonObject = new JSONObject();
		
		if(email.equalsIgnoreCase(employee.getEmail()) && pwd.equalsIgnoreCase(employee.getPassword()))		{
		
		jsonObject.put("Status", "Success");
		jsonObject.put("name", employee.getUsername());
		jsonObject.put("email", employee.getEmail());
		jsonObject.put("uid", employee.getEmployee_id());
		jsonObject.put("role", employee.getRole());
		
		response = jsonObject.toString();
	
		}
		else{
			
			jsonObject.put("Status","Failure");			
			response = jsonObject.toString();
			
		}
		
		return response;
	}
	@Path("/getAllEmployeeDetails")
	@GET
	@Produces("application/json")
	public List<Employee_details> getEmployeeDetails()
	{
		return nalanService.getEmployeeDetails();
	}
	
	@Path ("/individualUserLogin")
	@GET
	@Produces("application/json")
	
	public List<Employee_details> getIndividualUser(
			@QueryParam ("userid") int id) {
		return nalanService.getIndividualUser(id);
	}
	
	@Path ("/addUsers")
	@POST
	@Produces("application/json")
	
	public String saveUsers( Employee employee){
		return nalanService.saveUsers(employee);
	}
	
	@Path ("/editDetails")
	@POST
	@Produces("application/json")
	
	public String editDetails(Employee_detailscpy emplDetails){
		return nalanService.editDetails(emplDetails);
	}
	
	
	@Path("/applyLeave")
	@POST
	@Produces("application/json")
	
	public String applyLeave(LeaveDetails leaveDetails){
		return nalanService.applyLeave(leaveDetails);
	}
	
	@Path("/getUserAppliedLeave")
	@GET
	@Produces("application/json")
	
	public List<LeaveDetails> getUserAppliedLeave (
			@QueryParam("userid") int userid) {
		return nalanService.getUserAppliedLeave(userid);
	}
	
}