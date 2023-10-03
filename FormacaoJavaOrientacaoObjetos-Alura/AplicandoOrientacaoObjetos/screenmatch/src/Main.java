public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("\nSoma das Avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de Avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média das Avaliações: " + meuFilme.pegaMedia());
    }
}
