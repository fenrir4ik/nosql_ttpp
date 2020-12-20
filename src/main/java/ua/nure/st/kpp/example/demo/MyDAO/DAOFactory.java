package ua.nure.st.kpp.example.demo.MyDAO;

import ua.nure.st.kpp.example.demo.MongoDBDAO.MongoDbDAO;

public class DAOFactory {
	private static IDAO dao = null;
	
	public static IDAO getDAOInstance(TypeDAO type) {
		if (dao == null) {
			if (type == TypeDAO.MySQL)
			{
				dao = new MySQLDAO();
			}
			else
			{
				dao = new MongoDbDAO();
			}

		}
		return dao;
	}
}