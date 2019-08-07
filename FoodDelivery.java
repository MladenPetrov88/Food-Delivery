import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
        double chickenMenu = chicken * 10.35;
        double fishMenu = fish * 12.40;
        double veganMenu = vegan * 8.15;
        double totalCost = chickenMenu + fishMenu + veganMenu;
        double desertprice = totalCost * 0.20;
        double delivery = 2.50;
        double cost = totalCost + desertprice + delivery;
        System.out.printf("Total: %.2f", cost);
    }
}
