import java.util.Scanner;

public class SolarEnergyCalculator {

    // Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read energy values from the user
        System.out.print("Enter morning energy generated: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy generated: ");
        double eveningEnergy = sc.nextDouble();

        // Call the method
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Display result
        System.out.println("Total energy generated: " + totalEnergy);

        sc.close();
    }
}