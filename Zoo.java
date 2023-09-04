class Zoo {
    int zooId;
    String zooName;
    String location;
    int animalCount;
    int visitorsPerDay;

    public Zoo(int zooId, String zooName, String location, int animalCount, int visitorsPerDay) {
        this.zooId = zooId;
        this.zooName = zooName;
        this.location = location;
        this.animalCount = animalCount;
        this.visitorsPerDay = visitorsPerDay;

        System.out.println("Zoo ID: " + zooId);
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Location: " + location);
        System.out.println("Animal Count: " + animalCount);
        System.out.println("Visitors Per Day: " + visitorsPerDay);
        System.out.println();
    }
}
