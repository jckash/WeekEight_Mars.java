import java.util.Scanner;
public class MarsExpedition {
    public marsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("The Expedition prep program is starting...");
        System.out.println("We are gearing up...");
    System.out.println("Putting on space suit...");
        System.out.println("...");
        System.out.println("...Ready!");

        System.out.println("Hello space cadet. Please state your name!");

        String name = input.nextLine();

        System.out.println("Welcome" + name + ", to the Expedition prep Program. Are you ready to head out into the new world? Type Y or N");

        String excitement = input.nextLine();

        if (excitement.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are a team leader for reason");
} else {
            System.out.println("Too bad you are a team leader. You have to go.");
        }

        System.out.println("How many people do you want on your team? Enter an int number!");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way too many people! We can only send 2 more members.");
        } else if (teamSize < 2){
            System.out.println("You can't do this mission alone! You have to take someone with you!");
        } else {
            System.out.println("We just happen to have enough supplies for that team! Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");

        String snack = input.nextLine();

        System.out.println("How tasty! You will be bringing" + snack + "with you! (I'd make it last if I were you.)");

System.out.println("Now you know what you'll be eating, but what will you be driving? +" +
        "\n1: XL Microwave with four wheels" +
        "\n2: Space bike" +
        "\n3: Magic School Bus");

String vehicle = input.nextLine();

if(vehicle.equalsIgnoreCase("1")){
    vehicle = "XL Microwave with four wheels";
} else if (vehicle.equalsIgnoreCase("2")){
    vehicle = "Space bike";
} else if (vehicle.equalsIgnoreCase("3")){
    vehicle = "Magic School Bus";
} else {
    vehicle = "Get sucked up in to a black hole from your lack of transportation.";
}

System.out.println("You are now done crafting your elite team for Mars Expedition!" +
        "\n Your expedition will be led by the fearless" + name + "with" + teamSize + "teammates." +
        "\nTo explore the surface of Mars using " + vehicle + "." +
        "\nExploration team heads out in" +
        "\n5....." +
        "\n4....." +
        "\n3....." +
        "\n2....." +
        "\n1....." +
        "\nBLAST OFF!");

    }
}
