public class Quadrado implements FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return Math.pow(base, 2);
    }
}
