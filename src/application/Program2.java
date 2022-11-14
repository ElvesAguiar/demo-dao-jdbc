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
		
		System.out.println("====== TEST 2: department findall ========");
		
		for (Department dep:departmentDao.findAll()) {
			System.out.println(dep);
		};
		
		System.out.println("====== TEST 3: department insert ========");
		
		Department dep = new Department(7, "Tecnologia");
		//departmentDao.insert(dep);
		System.out.println("Inserted! New id = "+ dep.getId());
		
		Department department=departmentDao.findById(7);
		
		System.out.println("====== TEST 4: department update ========");
		
		department.setName("Tecnologia");
		//departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("====== TEST 5: department delete ========");
		departmentDao.deleteById(7);

		System.out.println("Delete completed");


	}

}
