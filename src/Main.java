import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a *Regualr* customer, *Membership* customer, or an *Employee*");
        String per = input.next();
        System.out.println("what is your social security number");
        int ssn = input.nextInt();
        System.out.println("how many hours did you visit");
        int hours = input.nextInt();
        System.out.println("How long do you go for ");
        int num = input.nextInt();
        if(per.equalsIgnoreCase("Regular")){
            Regular customer = new Regular(ssn,hours,num);
            System.out.println();
        }
        else if(per.equalsIgnoreCase("Membership")){
            Membership customer  = new Membership(ssn, hours, num);
            System.out.println();
        }
        else if(per.equalsIgnoreCase("Employee")){
            Employee customer = new Employee(ssn, hours, num);
            System.out.println();
        }
        else{
            System.out.println("please only enter regular, membership, or employee");
        }
    }
}
