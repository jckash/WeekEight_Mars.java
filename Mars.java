public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "File Invaders";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals -= (shipPopulation * 0.75) * 2;
        System.out.println(meals);
        meals += (meals * 0.5);
        shipPopulation += 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(100);
        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }


    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else if (((minute % 2) == 0) && ((minute % 3) == 0)) {
                System.out.println("Keep Center");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}










