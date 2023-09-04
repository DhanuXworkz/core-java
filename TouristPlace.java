class TouristPlace {
    int placeId;
    String placeName;
    String location;
    int visitorsPerYear;
    String popularActivity;

    public TouristPlace(int placeId, String placeName, String location, int visitorsPerYear, String popularActivity) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.location = location;
        this.visitorsPerYear = visitorsPerYear;
        this.popularActivity = popularActivity;

        System.out.println("Place ID: " + placeId);
        System.out.println("Place Name: " + placeName);
        System.out.println("Location: " + location);
        System.out.println("Visitors Per Year: " + visitorsPerYear);
        System.out.println("Popular Activity: " + popularActivity);
        System.out.println("\n");
    }
}


