package pizza;

import java.util.Scanner;

public class Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int SLICES_PER_PIZZA = 10;
        int SLICES_PER_PERSON = 2;
        Scanner s = new Scanner(System.in);

        System.out.println("What is the number of people ?");
        int people = Integer.parseInt(s.nextLine());
        int slices = people * SLICES_PER_PERSON;

        int num_pizzas = (slices + SLICES_PER_PIZZA - 1) / SLICES_PER_PIZZA; // round up
// Alternatively, you can use Math.ceil:
// int num_pizzas = (int) Math.ceil(1.0 * slices / SLICES_PER_PIZZA); // round up
        int remainder = (num_pizzas * SLICES_PER_PIZZA) - slices;

        System.out.println("For " + people + " people that would be " + num_pizzas + " pizza(s) with each person having " + SLICES_PER_PERSON + " slices each.");
        System.out.println("There would be " + remainder + " slice(s) leftover");

    }
}
