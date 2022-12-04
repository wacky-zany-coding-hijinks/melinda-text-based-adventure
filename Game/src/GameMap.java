public class GameMap {

    public static void map() {
        
        Room A = new Room("A");
        Room B = new Room("B");
        Room C = new Room("C");
        Room D = new Room("D");
        Room Home = new Room("Home");

        // Setting directions for each room, DTR
        A.setDirection(null, null, Home, null);
        B.setDirection(null, null, null, Home);
        C.setDirection(Home, null, null, null);
        D.setDirection(null, Home, null, null);
        Home.setDirection(A, B, C, D);

    }
}
