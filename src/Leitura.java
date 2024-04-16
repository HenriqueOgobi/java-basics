import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação para o filme");
        double avaliacaoFilme = leitura.nextDouble();

        System.out.println("Filme: "+ filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota do filme: " + avaliacaoFilme);
    }
}
