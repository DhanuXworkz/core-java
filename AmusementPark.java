class AmusementPark {
    int parkId;
    String parkName;
    String location;
    int totalRides;
    int visitorsPerDay;

    public AmusementPark(int parkId, String parkName, String location, int totalRides, int visitorsPerDay) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.location = location;
        this.totalRides = totalRides;
        this.visitorsPerDay = visitorsPerDay;

        System.out.println("Park ID: " + parkId);
        System.out.println("Park Name: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Visitors Per Day: " + visitorsPerDay);
        System.out.println();
    }
}
