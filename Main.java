import java.util.Scanner;

class Student {
    private String studentName;
    private String rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    
    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    
    public boolean checkEligibility() {
        return this.marks >= 50;
    }

    
    public double calculateFee() {
        return this.courseCredits * 1500.0;
    }


    public double calculateScholarship() {
        double totalFee = calculateFee();
        double scholarshipPercent = 0.0;

        if (this.marks >= 85) {
            scholarshipPercent = 0.20;
        } else if (this.marks >= 70 && this.marks <= 84) {
            scholarshipPercent = 0.10;
        }

        return totalFee * scholarshipPercent;
    }


    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    
    public void displayDetails() {
        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Marks Obtained    : " + marks);
        System.out.println("Course Registered : " + courseName);
        System.out.println("Course Credits    : " + courseCredits);
        System.out.println("Eligibility Status: Eligible");
        System.out.println("Total Base Fee    : Rs. " + calculateFee());
        System.out.println("Scholarship Amount: Rs. " + calculateScholarship());
        System.out.println("Final Payable Fee : Rs. " + calculateFinalFee());
        System.out.println("------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading student and course details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left behind

        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = scanner.nextInt();

        Student student = new Student(name, roll, marks, course, credits);

        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Failed: Student is not eligible for registration due to insufficient marks (less than 50).");
        }

        scanner.close();
    }
}
