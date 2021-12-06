public class Main {
    public static void main(String[] args) {
        int initBalance = 100;
        int sum = 1100;
        int bonus = sum / 100;
        int overallBalance = initBalance + sum + bonus;
        if (sum >= 1000)
            bonus = sum / 100;
        else
            bonus = 0;
        System.out.println(overallBalance);
    }}
