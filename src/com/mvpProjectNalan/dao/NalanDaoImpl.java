package com.mvpProjectNalan.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mvpProjectNalan.model.Employee;
import com.mvpProjectNalan.model.Employee_details;
import com.mvpProjectNalan.model.Employee_detailscpy;
import com.mvpProjectNalan.model.LeaveDetails;
import com.mvpProjectNalan.util.HibernateUtil;


public class NalanDaoImpl implements NalanDao {

	static HibernateUtil hibernateUtil = new HibernateUtil();
	String result = "Success";
		
	@Override
	public List<Employee_details> getEmployee() {
		hibernateUtil.openCurrentSession();
			
		List<Employee_details> empl_records = (List<Employee_details>)hibernateUtil.getCurrentSession().createQuery("from Employee_details").list();

		hibernateUtil.closeCurrentSession();
		return empl_records;
	}

	@Override
	public List<Employee_details> getUserdetails(int id) {
		hibernateUtil.openCurrentSession();
		
		List<Employee_details> empl_records = (List<Employee_details>) hibernateUtil.getCurrentSession().createQuery("from Employee_details where details_id='"+id+"' ").list();
		
		hibernateUtil.closeCurrentSession();
		return empl_records;
	}

	@Override
	public String saveUsers(Employee employee) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(employee);
		Employee_details employee_details = new Employee_details();
		employee_details.setEmpl(employee);
		hibernateUtil.getCurrentSession().save(employee_details);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return result;
	}

	@Override
	public String editDetails(Employee_detailscpy emplDetails) {
		hibernateUtil.openCurrentSessionwithTransaction();
		
		hibernateUtil.getCurrentSession().update(emplDetails);

		
		hibernateUtil.closeCurrentSessionwithTransaction();
		return result;
	}

	@Override
	public Employee findUserByEmail(String email, String pwd) {
			hibernateUtil.openCurrentSession();
			
			Employee employee = (Employee) hibernateUtil.getCurrentSession().createQuery("from Employee where email='"+email+"' and password='"+pwd+"' ").uniqueResult();
			
			hibernateUtil.closeCurrentSession();
			
			return employee;
	}

	@Override
	public String applyLeave(LeaveDetails leaveDetails) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().saveOrUpdate(leaveDetails);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return result;
	}

	@Override
	public List<LeaveDetails> getUserAppliedLeave(int userid) {
		
		hibernateUtil.openCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<LeaveDetails> empl_records = (List<LeaveDetails>) hibernateUtil.getCurrentSession().createQuery(" from LeaveDetails where employee_id='"+userid+"' ").list();
		
		hibernateUtil.closeCurrentSession();
		return empl_records;
		
	}

}


