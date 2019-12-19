package real_world_objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FlightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Flight> flightsList=new TreeSet<>(); // Flight needed compareTo
		flightsList.add(new Flight(100, "ayc", 212.22, 2.8f));
		flightsList.add(new Flight(101, "cbd", 282.11, 3.8f));
		flightsList.add(new Flight(102, "hdc", 112.28, 2.3f));
		flightsList.add(new Flight(103, "dbc", 200.42, 2.9f));
		flightsList.add(new Flight(104, "acd", 412.35, 4.5f));
		flightsList.add(new Flight(105, "adb", 392.24, 3.8f));
		flightsList.add(new Flight(107, "java", 322.24, 3.2f));
		flightsList.add(new Flight(107, "java", 322.24, 3.2f));
		flightsList.add(new Flight(107, "java", 322.24, 3.2f));
		flightsList.add(new Flight(107, "java", 322.24, 3.2f));
		flightsList.add(new Flight(108, "java", 322.24, 3.2f));
		
		System.out.println("flights");
		printFlights(flightsList);
		
	}
	
	public static void printFlights(Set<Flight> flightsList) {
		for(Flight f:flightsList) {
			System.out.println(f);
		}
		
	}

}
