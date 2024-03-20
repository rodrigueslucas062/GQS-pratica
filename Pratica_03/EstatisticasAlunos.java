package Pratica_03;
import java.util.Scanner;

public class EstatisticasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;
        int alunosReprovados = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int totalNotas = 0;
        int totalFaltas = 0;

        System.out.println("Informe a nota final e o total de faltas de cada aluno (ou digite uma nota negativa para sair):");

        int nota;
        while ((nota = scanner.nextInt()) >= 0) {
            int faltas = scanner.nextInt();

            totalNotas += nota;
            totalFaltas += faltas;

            if (nota >= 90) {
                alunosAprovados++;
            }

            if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            maiorNota = Math.max(maiorNota, nota);
            menorNota = Math.min(menorNota, nota);
        }

        int totalAlunos = alunosAprovados + alunosReprovados;
        if (totalAlunos == 0) {
            System.out.println("Nenhum aluno informado.");
        } else {
            double mediaNotas = (double) totalNotas / totalAlunos;

            System.out.println("Quantidade de alunos com nota final maior ou igual a 90: " + alunosAprovados);
            System.out.println("Quantidade de alunos reprovados por nota ou falta: " + alunosReprovados);
            System.out.println("Maior nota: " + (maiorNota == Integer.MIN_VALUE ? "N/A" : maiorNota));
            System.out.println("Menor nota: " + (menorNota == Integer.MAX_VALUE ? "N/A" : menorNota));
            System.out.println("Média de notas da turma: " + mediaNotas);
            System.out.println("Total de faltas: " + totalFaltas);
        }

        scanner.close();
    }
}
