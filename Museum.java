class Museum {
    int museumId;
    String museumName;
    String location;
    int exhibitCount;
    int visitorsPerYear;

    public Museum(int museumId, String museumName, String location, int exhibitCount, int visitorsPerYear) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.location = location;
        this.exhibitCount = exhibitCount;
        this.visitorsPerYear = visitorsPerYear;

        System.out.println("Museum ID: " + museumId);
        System.out.println("Museum Name: " + museumName);
        System.out.println("Location: " + location);
        System.out.println("Exhibit Count: " + exhibitCount);
        System.out.println("Visitors Per Year: " + visitorsPerYear);
        System.out.println();
    }
}


