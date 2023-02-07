import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codePieceOne, codePieceTwo, quantityPieceOne, quantityPieceTwo;
        double valuePieceOne, valuePieceTwo, total; 
        
        codePieceOne = sc.nextInt();
        quantityPieceOne = sc.nextInt();
        valuePieceOne = sc.nextDouble();
        codePieceTwo = sc.nextInt();
        quantityPieceTwo = sc.nextInt();
        valuePieceTwo = sc.nextDouble();

        total = quantityPieceOne * valuePieceOne + quantityPieceTwo * valuePieceTwo;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}