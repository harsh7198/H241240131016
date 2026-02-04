import java.util.Scanner;

public class practical_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (Pounds): ");
        float W = sc.nextFloat();

        System.out.print("Enter Height (Inches): ");
        float H = sc.nextFloat();

        double weightKg = W * 0.45359237;
        double heightMeter = H * 0.0254;

        double bmi = weightKg / (heightMeter * heightMeter);

        System.out.println("BMI is : " + bmi);


    }
}
