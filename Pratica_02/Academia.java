import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do cliente:");
        int idade = scanner.nextInt();

        System.out.println("Informe o sexo do cliente (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);

        double mensalidade = calcularMensalidade(idade, sexo);
        System.out.println("O valor da mensalidade a ser paga é: R$" + mensalidade);

        scanner.close();
    }

    public static double calcularMensalidade(int idade, char sexo) {
        double mensalidade = 0;

        if ((sexo == 'M' || sexo == 'm') && idade <= 15) {
            mensalidade = 60.00;
        } else if ((sexo == 'M' || sexo == 'm') && idade >= 16 && idade <= 18) {
            mensalidade = 75.00;
        } else if ((sexo == 'M' || sexo == 'm') && idade >= 19 && idade <= 30) {
            mensalidade = 90.00;
        } else if ((sexo == 'M' || sexo == 'm') && idade >= 31 && idade <= 40) {
            mensalidade = 85.00;
        } else if ((sexo == 'M' || sexo == 'm')) {
            mensalidade = 80.00;
        } else if ((sexo == 'F' || sexo == 'f') && idade <= 18) {
            mensalidade = 60.00;
        } else if ((sexo == 'F' || sexo == 'f') && idade >= 19 && idade <= 25) {
            mensalidade = 90.00;
        } else if ((sexo == 'F' || sexo == 'f') && idade >= 26 && idade <= 40) {
            mensalidade = 85.00;
        } else if ((sexo == 'F' || sexo == 'f')) {
            mensalidade = 80.00;
        }

        return mensalidade;
    }
}
