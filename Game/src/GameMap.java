public class GameMap {

    Room A = new Room("A");
    Room B = new Room("B");
    Room C = new Room("C");
    Room D = new Room("D");
    Room Home = new Room("Home");
    Room currentRoom;

    // Constructor
    public GameMap() {

        // Setting directions for each room, DTR
        this.A.setDirection(null, null, this.Home, null);
        this.B.setDirection(null, null, null, this.Home);
        this.C.setDirection(this.Home, null, null, null);
        this.D.setDirection(null, this.Home, null, null);
        this.Home.setDirection(this.A, this.B, this.C, this.D);

        this.currentRoom = this.Home;

        // System.out.println("First I was here: " + currentRoom.name);

    }

    // User input dictating nav
    public void userDirection(String direction) {


        if (direction.equals("north") && this.currentRoom.getNorth() != null) {
            this.currentRoom = this.currentRoom.getNorth();

        } else if (direction.equals("east") && this.currentRoom.getEast() != null) {
            this.currentRoom = this.currentRoom.getEast();
        } 
        else if (direction.equals("south") && this.currentRoom.getSouth() != null) {
            this.currentRoom = this.currentRoom.getSouth();
        } 
        else if (direction.equals("west") && this.currentRoom.getWest() != null) {
            this.currentRoom = this.currentRoom.getWest();
        } 
        else {
            System.out.println("Sorry, you suck. You are still in " + this.currentRoom.name);
        }
        System.out.println("You are in " + this.currentRoom.name);
    }

}



// If I'm in a room, and I pick a direction, and I can't go that direction, this is not good, chose another direciton