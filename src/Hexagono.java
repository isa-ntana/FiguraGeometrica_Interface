public class Hexagono implements FiguraGeometrica{

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return (altura * base) / 2;
    }
}
