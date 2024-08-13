package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { // macete pra esconder a implementação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
