import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Do something");

        GameMap myMap = new GameMap();

        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.print("What it do baby boo: "); // Input from user
            String direction = myObj.nextLine();

            myMap.userDirection(direction);

        }

        // TODO Navigation Actions

        // TODO Other Actions

        // TODO Input from user

        // TODO Call different actions
    }
}
