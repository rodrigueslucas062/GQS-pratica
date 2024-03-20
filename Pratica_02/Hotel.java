import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de apartamento (S para simples, D para duplo):");
        char tipoApartamento = scanner.next().charAt(0);

        System.out.println("Informe a quantidade de dias hospedados:");
        int diasHospedados = scanner.nextInt();

        double totalPagar = calcularTotalPagar(tipoApartamento, diasHospedados);
        System.out.println("O total a ser pago é: R$" + totalPagar);

        scanner.close();
    }

    public static double calcularTotalPagar(char tipoApartamento, int diasHospedados) {
        double totalPagar = 0;

        if (tipoApartamento == 'S' || tipoApartamento == 's') {
            if (diasHospedados < 10) {
                totalPagar = diasHospedados * 100.00;
            } else if (diasHospedados >= 10 && diasHospedados <= 15) {
                totalPagar = diasHospedados * 90.00;
            } else {
                totalPagar = diasHospedados * 80.00;
            }
        } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
            if (diasHospedados < 10) {
                totalPagar = diasHospedados * 140.00;
            } else if (diasHospedados >= 10 && diasHospedados <= 15) {
                totalPagar = diasHospedados * 120.00;
            } else {
                totalPagar = diasHospedados * 100.00;
            }
        }

        return totalPagar;
    }
}
