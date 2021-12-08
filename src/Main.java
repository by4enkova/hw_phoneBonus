public class Main {
    public static void main(String[] args) {
        int initBalance = 100;
        int sum = 110;
        int bonus = sum / 100;
        if (sum >= 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        int overallBalance = initBalance + sum + bonus;

        System.out.println(overallBalance);
    }
}