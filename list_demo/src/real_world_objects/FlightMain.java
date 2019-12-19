package real_world_objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Flight> flightsList=new ArrayList<>();
		flightsList.add(new Flight(100, "ayc", 212.22, 2.8f));
		flightsList.add(new Flight(101, "cbd", 282.11, 3.8f));
		flightsList.add(new Flight(102, "hdc", 112.28, 2.3f));
		flightsList.add(new Flight(103, "dbc", 200.42, 2.9f));
		flightsList.add(new Flight(104, "acd", 412.35, 4.5f));
		flightsList.add(new Flight(105, "adb", 392.24, 3.8f));
		
		System.out.println(flightsList);
		
		Collections.sort(flightsList);
		System.out.println("sort on id");
		printFlights(flightsList);
		Collections.sort(flightsList, new FlightNameComparator());
		System.out.println("\nsort on name");
		printFlights(flightsList);
		
		Collections.sort(flightsList, (f1,f2)->{
			Double d1=f1.getCost();
			Double d2=f2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nsort on cost");
		printFlights(flightsList);
		
		Collections.sort(flightsList, (f1,f2)->{
			Float r1=f1.getRating();
			Float r2=f2.getRating();
			int x = r2.compareTo(r1);
			if(x == 0) {
				Double d1=f1.getCost();
				Double d2=f2.getCost();
				return d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\nsort on Rating then cost");
		printFlights(flightsList);
		
	}
	
	public static void printFlights(List<Flight> flightsList) {
		for(int i = 0; i < flightsList.size(); i++) {
			System.out.println(flightsList.get(i).toString());
		}
		
	}

}
