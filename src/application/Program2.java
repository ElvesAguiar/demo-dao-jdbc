package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====== TEST 1: department findById ========");
		
		System.out.println(departmentDao.findById(3)); 

	}

}
