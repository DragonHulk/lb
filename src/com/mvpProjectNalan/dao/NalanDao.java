package com.mvpProjectNalan.dao;


import com.mvpProjectNalan.model.Employee;
import com.mvpProjectNalan.model.Employee_details;
import com.mvpProjectNalan.model.Employee_detailscpy;
import com.mvpProjectNalan.model.LeaveDetails;

import java.util.List;

public interface NalanDao {
	
	public String editDetails (Employee_detailscpy emplDetails);

	public List<Employee_details> getEmployee();

	public List<Employee_details> getUserdetails(int id);

	public String saveUsers(Employee employee);

	public Employee findUserByEmail(String email, String pwd);

	public String applyLeave(LeaveDetails leaveDetails);

	public List<LeaveDetails> getUserAppliedLeave(int userid);
}
