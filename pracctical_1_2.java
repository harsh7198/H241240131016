import java.util.Scanner;

public class practical_2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to linear equation solver.");
        System.out.println("Format : ax+by = e and cx+dy = f");
        System.out.println("Enter a :");
        int a = input.nextInt();
        System.out.println("Enter b :");
        int b = input.nextInt();
        System.out.println("Enter c :");
        int c = input.nextInt();
        System.out.println("Enter d :");
        int d = input.nextInt();
        System.out.println("Enter e :");
        int e = input.nextInt();
        System.out.println("Enter f :");
        int f = input.nextInt();
        int D = (a*d)-(c*b);
        if(D==0){
            System.out.println("Determinent is Zero");
            return;
        }
        float Dx = (e*d)-(f*b);
        float Dy = (a*f)-(c*e);
        float x = (Dx/D) ;
        float y = (Dy/D) ;
        System.out.println("X is : " + x);
        System.out.println("Y is : " + y);

    }
}
