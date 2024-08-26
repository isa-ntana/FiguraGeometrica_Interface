import java.util.Map;
import java.util.Scanner;

public class IO {
    public static void menu(){
        FiguraGeometrica figura = null;
        boolean execute = true;

        while (execute) {
            System.out.println("\n Primeiro digite os valores que utilizaremos! \n ");
            double base = scanner("Digite o valor da base: ").nextDouble();
            double altura = scanner("Digite o valor da altura: ").nextDouble();
            double raio = scanner("Digite o valor do raio: ").nextDouble();

            int opcao = scanner("Agora escolha a área de qual figura deseja calcular com esses valores: " +
                    "\n 1 - Triangulo" +
                    "\n 2 - Quadrado" +
                    "\n 3 - Retângulo" +
                    "\n 4 - Hexágono" +
                    "\n 5 - Círculo" +
                    "\n 0 - Sair").nextInt();
            if (opcao == 1) {
                figura = new Triangulo();
            } else if (opcao == 2) {
                figura = new Quadrado();
            } else if (opcao == 3) {
                figura = new Retangulo();
            } else if (opcao == 4) {
                figura = new Hexagono();
            } else if (opcao == 5) {
                figura = new Circulo();
            } else if (opcao == 0) {
                execute = false;
            } else {
                throw new RuntimeException("Opção inválida, tente novamente.");
            }

            if (figura == null) throw new NullPointerException("Você não selecionou nenhuma figura.");
            calcularArea(base, altura, raio, figura);
        }
    }

    public static void calcularArea(double area, double altura, double raio, FiguraGeometrica figura){
        double resultado = figura.calcularArea(area, altura, raio);
        System.out.println("Resultado: " + resultado);
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
