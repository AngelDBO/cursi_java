package operadores;

public class OperadorProcedencia {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / (3d * 10);
        System.out.println("promedio = " + promedio);

        int n = (int) Math.round(promedio);
        System.out.println("n = " + n);
    }
}
