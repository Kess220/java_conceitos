public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };

        // Chamando a função imparOuPar com um número para verificar se é ímpar ou par
        int numeroExemplo = 5;
        imparOuPar(numeroExemplo);
        tabelaMultiplicacao(numeroExemplo);
        duplicadoNao(array1, array2);

    }

    // Função para verificar se um número é ímpar ou par
    public static void imparOuPar(int x) {
        if (x % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    public static void tabelaMultiplicacao(int x) {
        for (int i = 1; i <= 10; i++) {
            int resultado = x * i;

            System.out.println("5 x " + i + " = " + resultado);
        }
    }

    public static void duplicadoNao(String[] array1, String[] array2) {
        System.out.println("Elementos comuns:");

        for (String elemento1 : array1) {
            for (String elemento2 : array2) {
                System.out.println(elemento1);
                break;
            }
        }
    }

}
