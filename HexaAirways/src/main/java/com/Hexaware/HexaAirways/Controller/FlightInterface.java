package com.Hexaware.HexaAirways.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Hexaware.HexaAirways.Pojo.Flight;

public interface FlightInterface extends CrudRepository<Flight, Integer> {
	@Query(value="select * from flight_details where source =?1 and destination =?2 and doj =?3 and class =?4 and seats >?5 " , nativeQuery= true)
	List<Flight> findflight(String source,String destination , LocalDate doj,String category,int passangers);
}
