import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vloz cislo na faktorial: ");
        int sum = sc.nextInt();
        for(int i = sum-1; i > 0; i--){
            System.out.println( sum + " * " + i + " = " + i*sum);
            sum = i*sum;
        }
    }
}

