import java.util.Scanner;

public class Alunos_Acima_Media {

    static float media;
    private String[] Nomes;
    private float[] Notas;

    // Construtor utilizando a palavra-chave 'this'
    public Alunos_Acima_Media(int n, String[] Nomes, float[] Notas) {
        this.Nomes = Nomes;
        this.Notas = Notas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos há na turma? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        String[] Nomes = new String[n];
        float[] Notas = new float[n];
        float Soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Insira o nome do aluno " + (i + 1) + ": ");
            Nomes[i] = scanner.nextLine();
            System.out.print("Insira a nota do aluno " + (i + 1) + ": ");
            Notas[i] = scanner.nextFloat();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextFloat
            Soma += Notas[i];
        }

        media = Soma / n;
        Alunos_Acima_Media turma = new Alunos_Acima_Media(n, Nomes, Notas);

        System.out.println("Alunos com nota acima da média (" + media + "):");
        turma.imprimirAlunosAcimaMedia();
    }

    public void imprimirAlunosAcimaMedia() {
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] > media) {
                System.out.println(Nomes[i]);
            }
        }
    }
}

