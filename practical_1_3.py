import java.util.Scanner ;

public class practical_1_3{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);
         ch = Character.toLowerCase(ch);

                // vowel check
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Not a vowel");
                }

        }
}