package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("Teste 1: testando a função find by id");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("Teste 2: testando a função find by department");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Teste 3: testando a função find by department");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Teste 4: testando a função insert seller");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4530.000, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
		System.out.println("Teste 4: testando a função update seller");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed! ;)");
		
		
		System.out.println("Teste 5: testando a função delete seller");
		sellerDao.deleteById(2);
		System.out.println("Delete operation completed! ;)");
		
	}
}
