package exercicios;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0, b = 300, result = 0;

        try {
            result = b / a;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
