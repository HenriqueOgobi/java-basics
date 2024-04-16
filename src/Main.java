public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Math");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);
        //Média calculada
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse= """
                Filme top Gun,
                com tom cruise,
                Filme bom!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int estrelas = (int) (media/2);
        System.out.println(estrelas);
        
    }
}