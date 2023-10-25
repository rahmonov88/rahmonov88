package day12_switch_statements;

public class Practice {
    public static void main(String[] args) {

        int bonus = 20000;
        switch (bonus) {
            case 5000:
                System.out.println("Good job");
                break;
            case 10000:
                System.out.println("Great job");
                break;
            case 15000:
                System.out.println("Excellent  job");
                break;
            default:
                System.out.println("Bonus amount");
        }

    }
}
