import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        System.out.println("Calculo imc eba");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\nInsira seu peso: ");
            double peso = sc.nextDouble();
            System.out.println("\nInsira sua altura: ");
            double altura = sc.nextDouble();
            double imc = peso / (altura * altura);
            System.out.println("\n\nIMC: " + imc + ". Classif: ");
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
            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("vc e idiota n pode letra");
        }

    }
}
