import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        System.out.println("Calculo imc eba");
        
        boolean oiii = false;
        boolean tchauuu = false;
        float peso = 0, altura = 0, imc = 0;


        Scanner sc = new Scanner(System.in);
        
        oiii = false;
        while (oiii == false) {
            try {
                System.out.println("\nInsira seu peso: ");
                
                peso = sc.nextFloat();
                
                oiii = true;
            } catch (InputMismatchException e) {
                System.out.println("vc e idiota n pode letra");
                sc.nextLine();
            }
        }

        tchauuu = false;
        while (tchauuu == false) {
            try {
                oiii = false;
                while (oiii == false) {
                    try {
                        System.out.println("\nInsira sua altura: ");
                        altura = sc.nextFloat();
                        oiii = true;
                    } catch (InputMismatchException e) {
                        sc.nextLine();
                        System.out.println("vc e idiota n pode letra");
                    }
                }
                
        imc = peso / (altura * altura);
        tchauuu = true;
            } catch (ArithmeticException e) {
                System.out.println("Altura zero n existe :c");
            } 

            System.out.println("\n\nIMC: " + String.format("%.2f", imc) + ". Classif: ");
            if (imc < 18.5) {
                System.out.println("Magreza.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Normal.");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Sobrepeso.");
            } else if (imc >= 30.0 && imc <= 39.9) {
                System.out.println("Obesidade.");
            } else {
                System.out.println("Obesidade grave.");
            }
        }

        sc.close();
    }
}
