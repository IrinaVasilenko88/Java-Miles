public class Main {
public static void main (String [] args) {
    int price = 50_896;
    int bonusMiles = 1;
    int rubles = 20;
    int totalBonus = price * bonusMiles / rubles;
    System.out.println(totalBonus);
    }
}