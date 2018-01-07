import java.util.Scanner;

public class years {

    public static void main(String[] args) {
        double mins, years, days;
        Scanner sc = new Scanner(System.in);
        mins = sc.nextDouble();

        years = mins /(60.0*24.0*365.0);
        days = mins /(60.0*24.0);
        System.out.println("the number of days are "+days + " and number of years are "+years);
    }
}
