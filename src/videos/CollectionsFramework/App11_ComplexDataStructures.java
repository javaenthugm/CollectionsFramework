package videos.CollectionsFramework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App11_ComplexDataStructures {
	
	public static String[] vehicles ={
		"ambulance","helicopter","lifeboat"
	};
	
	public static String[][] drivers={
		{"Fred","Sue","Pete"},
		{"Sue","Richard","Bob","Fred"},
		{"Pete","Mary","Bob"}		
	};
	
	public static void main(String args[]){
		Map<String, Set<String>> personal = new HashMap<String, Set<String>>();
		
		for(int i=0;i<vehicles.length;i++){
			String vehicle = vehicles[i];
			
			String[] driverList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<>(Arrays.asList(driverList));
			
			personal.put(vehicle, driverSet);
		}
		
		{ // Added this bracket just to reuse the varibale
			Set<String> driversList = personal.get("helicopter");
			for(String driver:driversList){
				System.out.println(driver);
			}
		}
		
		for(String vehicle:personal.keySet()){
			System.out.print(vehicle+":");
			Set<String> dirversList = personal.get(vehicle);
			for(String driver: dirversList){
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
