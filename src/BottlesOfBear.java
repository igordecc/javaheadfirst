public class BottlesOfBear {

    public static void main(String[] args) {
        String object = "bottles";
        String type = "of bear";

        int amount = 99;
        while (amount > 0) {
            System.out.println(amount + " " + object + " " + type + " on a shelf");
            System.out.println(amount + " " + object + " " + type);
            System.out.println("Take one down");
            System.out.println("Pass it around");
            amount--;
            if (amount == 0) {
                System.out.println("No bear left");
                System.out.println("How big is my debt?");
            }
        }
    }
}
