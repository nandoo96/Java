public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media das avaliações: " + media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura dos anos 80
                Muito bom!
                Ano de Lançamento: """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println("Classificação do filme: " + classificacao);
    }
}