public class Trip {
    Passenger passenger;
    Driver driver;
    Location from;
    Location to;
    double baseFare;
    boolean completed;


    public Trip(Passenger passenger, Driver driver, Location from, Location to, double baseFare) {
        this.passenger = passenger;
        this.driver = driver;
        this.from = from;
        this.to = to;
        this.baseFare = baseFare;
        this.completed = false;
        driver.setAvailable(false);
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public boolean isCompleted() {
        return completed;
    }
    double getDistance(){
        return from.distanceTo(to);
    }
    double calculateFare(){
        return getBaseFare()+15.0*getDistance();
    }
    void completeTrip(){
        this.completed=true;
        driver.setAvailable(true);
    }
    String getSummary(){
        return "Trip Summary\nPassenger : "+passenger.getName()+"\nDriver : "+driver.getName()+" ("+driver.getLicencePlate()+")\nFrom : "+from.toString()+"\nTo :"+to.toString()+"\nDistance : "+getDistance()+"\nFare : BDT "+calculateFare()+"\nStatus : "+(isCompleted()? "COMPLETED" : "IN PROGRESS");
    }

}
