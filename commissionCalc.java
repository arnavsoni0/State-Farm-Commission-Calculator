import java.util.Scanner;

public class commissionCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double autoPolicyPercent = .02;
        double firePolicyPercent = .02;
        double lifePolicyPercent = .05;
        double healthPolicyPercent = .10;


        System.out.println("Auto Policy Count: ");
        int autoPolicyCount = Integer.valueOf(scanner.nextLine());

        System.out.println("Auto Policy Premium Total: ");
        double autoPolicyPremium = Double.valueOf(scanner.nextLine());

        System.out.println("Fire Policy Count: ");
        int firePolicyCount = Integer.valueOf(scanner.nextLine());

        System.out.println("Fire Policy Premium Total: ");
        double firePolicyPremium = Double.valueOf(scanner.nextLine());

        System.out.println("Life Policy Count: ");
        int lifePolicyCount = Integer.valueOf(scanner.nextLine());

        System.out.println("Life Policy Premium Total: ");
        double lifePolicyPremium = Double.valueOf(scanner.nextLine());

        System.out.println("Health Policy Count: ");
        int healthPolicyCount = Integer.valueOf(scanner.nextLine());

        System.out.println("Health Policy Premium Total: ");
        double healthPolicyPremium = Double.valueOf(scanner.nextLine());
        


        if (autoPolicyCount >= 15) {
            autoPolicyPercent = autoPolicyPercent + .01;
        }
        if (firePolicyCount >= 10) {
            firePolicyPercent = firePolicyPercent + .01;
        }


        if (lifePolicyCount == 1) {
            autoPolicyPercent = autoPolicyPercent + .01;
            firePolicyPercent = firePolicyPercent + .01;
            lifePolicyPercent = lifePolicyPercent + .05;
        } else if (lifePolicyCount == 2) {
            autoPolicyPercent = autoPolicyPercent + .02;
            firePolicyPercent = firePolicyPercent + .02;
            lifePolicyPercent = lifePolicyPercent + .01;
        } else if (lifePolicyCount == 3) {
            autoPolicyPercent = autoPolicyPercent + .02;
            firePolicyPercent = firePolicyPercent + .02;
            lifePolicyPercent = lifePolicyPercent + .10;
        } else if (lifePolicyCount == 4) {
            autoPolicyPercent = autoPolicyPercent + .02;
            firePolicyPercent = firePolicyPercent + .02;  
            lifePolicyPercent = lifePolicyPercent + .13;       
        } else if (lifePolicyCount == 5 || lifePolicyCount == 6) {
            autoPolicyPercent = autoPolicyPercent + .03;
            firePolicyPercent = firePolicyPercent + .03;
            lifePolicyPercent = lifePolicyPercent + .15;
        } else if (lifePolicyCount == 7) {
            autoPolicyPercent = autoPolicyPercent + .04;
            firePolicyPercent = firePolicyPercent + .04;
            lifePolicyPercent = lifePolicyPercent + .15;
        }

        double autoCommission = autoPolicyPremium * autoPolicyPercent;
        double fireCommission = firePolicyPremium * firePolicyPercent; 
        double lifeCommission = lifePolicyPremium * lifePolicyPercent;
        double healthCommission = healthPolicyPremium * healthPolicyPercent;
        
        System.out.println("Total Auto Policies Commission: " + autoCommission);
        System.out.println("Total Fire Policies Commission: " + fireCommission);
        System.out.println("Total Life Policies Commission: " + lifeCommission);
        System.out.println("Total Health Policies Commission: " + healthCommission);
        System.out.println("------------------------------------------------------");
        System.out.println("Total Commision: " + (autoCommission + fireCommission + lifeCommission + healthCommission));

 
    }
}

