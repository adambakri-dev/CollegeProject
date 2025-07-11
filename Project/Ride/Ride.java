package Project.Ride;

import Project.Users.Driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// This class will have a direct operation with class Driver
// but passengers Operations will be in class RideDataBase
public class Ride {
    private int seats;
    private Driver driver;
    private HashMap<String, ArrayList<String>> timeTravel;
    private String location;
    private String destination;
    private String SelectedHour;
    private String DateAndDay;
    private List<String> passengers;
    public Ride(int seats, Driver driver, String location, String destination, String hour, String DateAndDay) {
        this.seats = seats;
        this.driver = driver;
        this.location = location;
        this.destination = destination;
        this.SelectedHour=hour;
        this.DateAndDay=DateAndDay;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Driver getDriver() { return driver; }
    public String getDriverName() { return driver.getName(); }
    public String getLocation() { return location; }
    public String getDestination() { return destination; }
    public HashMap<String, ArrayList<String>> getTimeTravel() { return timeTravel; }
    public int getSeats() { return seats; }
    public List<String> getPassengers() {
        return passengers;
    }
    public String getDateAndDay() {
        return DateAndDay;
    }

    public String getHour() {
        return SelectedHour;
    }

    @Override
    public String toString() {
        return getDriverName() + "," + location + "," + destination + "," + timeTravel.toString() + "," + seats;
    }
}
