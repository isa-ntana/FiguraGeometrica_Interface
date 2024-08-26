public class Triangulo implements FiguraGeometrica{

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return (base*altura)/2;
    }
}
