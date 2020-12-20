package ua.nure.st.kpp.example.demo.MyDAO;


import ua.nure.st.kpp.example.demo.MongoDBDAO.MongoDbDAO;
import ua.nure.st.kpp.example.demo.Parse.MySQLDAO;

import java.util.concurrent.TimeUnit;


public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		MongoDbDAO dao = new MongoDbDAO();
		long t1 = 0;
		long t2 = 0;
		double result = 0;

		dao.AverageHeightForPlantsWithNeedles();
		dao.AverageHeightForPlantsWithNeedles();

		System.out.println("\n\nNO AGGREGATION");
		t1 = System.nanoTime();
		result = dao.AverageTemperatureRose();
		t2 = System.nanoTime();
		System.out.println("Function AverageTemperatureRose() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.SumDaysCactus();
		t2 = System.nanoTime();
		System.out.println("Function SumDaysCactus() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.CountSandPlants();
		t2 = System.nanoTime();
		System.out.println("Function CountSandPlants() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.AverageHeightForPlantsWithNeedles();
		t2 = System.nanoTime();
		System.out.println("Function AverageHeightForPlantsWithNeedles() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.MaxHeightOfRoses();
		t2 = System.nanoTime();
		System.out.println("Function MaxHeightOfRoses() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");


		System.out.println("\n\nAGGREGATION FRAMEWORK");
		t1 = System.nanoTime();
		result = dao.AF_AverageTemperatureRose();
		t2 = System.nanoTime();
		System.out.println("Function AF_AverageTemperatureRose() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.AF_SumDaysCactus();
		t2 = System.nanoTime();
		System.out.println("Function AF_SumDaysCactus() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.AF_CountSandPlants();
		t2 = System.nanoTime();
		System.out.println("Function AF_CountSandPlants() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.AF_AverageHeightForPlantsWithNeedles();
		t2 = System.nanoTime();
		System.out.println("Function AF_AverageHeightForPlantsWithNeedles() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

		t1 = System.nanoTime();
		result = dao.AF_MaxHeightOfRoses();
		t2 = System.nanoTime();
		System.out.println("Function AF_MaxHeightOfRoses() | Result: " + result + " Time: " + (t2-t1)/1000000 + " миллисекнуд");

	}
}
