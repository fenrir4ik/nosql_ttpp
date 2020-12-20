package ua.nure.st.kpp.example.demo.MyDAO;
import ua.nure.st.kpp.example.demo.Flowers.Plant;

import java.util.ArrayList;


public interface IDAO {
	Plant Insert_Plant(Plant plant);
	ArrayList<Plant> Get_Plants();
	ArrayList<Plant> SelectByGroundName(String name);
	void ChangeGround(String plant_name, String ground_name, String ground_desription);
	void DeletePlantByName(String plant_name);
	ArrayList<Plant> Get_Plants_By_Name(String name);
}
