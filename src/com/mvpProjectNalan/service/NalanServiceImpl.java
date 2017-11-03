package com.mvpProjectNalan.service;

import java.util.List;

import com.mvpProjectNalan.model.Employee;
import com.mvpProjectNalan.model.Employee_details;
import com.mvpProjectNalan.model.Employee_detailscpy;
import com.mvpProjectNalan.model.LeaveDetails;
import com.mvpProjectNalan.dao.NalanDao;
import com.mvpProjectNalan.dao.NalanDaoImpl;

public class NalanServiceImpl implements NalanService {
	
	NalanDao nalanDao = new NalanDaoImpl();
	

	@Override
	public List<Employee_details> getEmployeeDetails() {
		
		return nalanDao.getEmployee();
	}

	@Override
	public List<Employee_details> getIndividualUser(int id) {
		return nalanDao.getUserdetails(id);
		
	}

	@Override
	public String saveUsers(Employee employee) {
		
		return nalanDao.saveUsers(employee);
	}

	@Override
	public String editDetails(Employee_detailscpy  emplDetails) {
		
		return nalanDao.editDetails(emplDetails);
	}

	@Override
	public Employee findUserByEmail(String email, String pwd) {
		return nalanDao.findUserByEmail(email, pwd);
	}

	@Override
	public String applyLeave(LeaveDetails leaveDetails) {
		
		return nalanDao.applyLeave(leaveDetails);
	}

	@Override
	public List<LeaveDetails> getUserAppliedLeave(int userid) {
		
		return nalanDao.getUserAppliedLeave(userid);
	}
}
