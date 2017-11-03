package com.mvpProjectNalan.service;

import java.util.List;
import com.mvpProjectNalan.model.Employee;
import com.mvpProjectNalan.model.Employee_details;
import com.mvpProjectNalan.model.Employee_detailscpy;
import com.mvpProjectNalan.model.LeaveDetails;

public interface NalanService {

	public List<Employee_details> getEmployeeDetails();

	public List<Employee_details> getIndividualUser(int id);

	public String saveUsers(Employee employee);

	public String editDetails(Employee_detailscpy emplDetails);

	public Employee findUserByEmail(String email, String pwd);

	public String applyLeave(LeaveDetails leaveDetails);

	public List<LeaveDetails> getUserAppliedLeave(int userid);
}
