package exercicios;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0, b = 300, result = 0;

        try {
            result = b / a;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            // LANÇANDO UMA EXCEÇÃO NO CONSOLE
            throw new IllegalArgumentException("Não pode ser dividido por zero!");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
