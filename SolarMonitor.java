import java.util.Scanner;

public class SolarMonitor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the energy generated (in kWh): ");
        double energyGenerated = scanner.nextDouble();

        
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

    
        scanner.close();
    }
}
