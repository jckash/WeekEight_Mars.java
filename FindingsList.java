import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException{


        Thread.sleep(500);

        System.out.println("Thank goodness, you've made it back! We were worried for a second." +
                "Time to catalog everything you found.");

        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("First we will observe the collection of rocks you've brought us." +
                "Rock catalogue has been successfully downloaded.");

        System.out.println(rockList);

        System.out.println("What is this 'not rock'? We will need to delete this before Captain sees.");

        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Phew. That's better.");

        System.out.println("Standby for fossil download.");

        Thread.sleep(1000);

        HashMap<String, String> fossilList = new HashMap<>();

        fossilList.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossilList.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water.");
        fossilList.put("Tooth Fossil", "The tooth from an unknown fossil.");

        System.out.println("Fossil catalogue has downloaded.");

        System.out.println("Which fossil would you like to learn more about? (Bird Fossil, Fish Fossil , or Tooth Fossil)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println(fossilChoice + "\nDescription: " + fossilList.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println(fossilChoice + "\nDescription: " + fossilList.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println(fossilChoice + "\nDescription " + fossilList.get("Tooth Fossil"));
        }


        System.out.println("Loading information on special supplies used on expedition...");

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();
        supplies.add("Iphone with unlimited texting");
        supplies.add("Light plasma machete");
        supplies.add("Time and space distorter");

        System.out.println("Supplies before Expedition");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        supplies.remove("Light plasma machete");



    System.out.println("Supplies After Expedition");
    Iterator itr2 = supplies.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


    }
}
