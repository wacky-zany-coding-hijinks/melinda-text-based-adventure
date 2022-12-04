

public class Room {

    private Room north;
    private Room east;
    private Room south;
    private Room west;
    String name;
    
    // Constructor 
    public Room(String name) {
        this.name = name;
    }

    // Setting all direction for one room - WHERE YOU GOING?
    public void setDirection(Room north, Room east, Room south, Room west){
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public Room getNorth () {
        // System.out.println("North of Room " + this.name + " is " + this.north.name);
        return this.north;
    }

    public Room getEast () {
        // System.out.println("East of Room " + this.name + " is " + this.east.name);
        return this.east;
    }

    public Room getSouth () {
        // System.out.println("South of Room " + this.name + " is " + this.south.name);
        return this.south;
    }

    public Room getWest () {
        // System.out.println("West of Room " + this.name + " is " + this.west.name);
        return this.west;
    }




}


