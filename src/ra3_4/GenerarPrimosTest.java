package ra3_4;

import java.util.Arrays;

public class GenerarPrimosTest {

    public static void main(String[] args) {
        testGenerarPrimos();
    }

    public static void testGenerarPrimos() {
        // Caso de prueba 1
        int max1 = 10;
        int[] resultado1 = generarPrimos(max1);
        int[] esperado1 = {2, 3, 5, 7};
        verificarResultado(max1, resultado1, esperado1);

        // Caso de prueba 2
        int max2 = 20;
        int[] resultado2 = generarPrimos(max2);
        int[] esperado2 = {2, 3, 5, 7, 11, 13, 17, 19};
        verificarResultado(max2, resultado2, esperado2);

        // Caso de prueba 3
        int max3 = 1;
        int[] resultado3 = generarPrimos(max3);
        int[] esperado3 = {};
        verificarResultado(max3, resultado3, esperado3);
    }

    public static void verificarResultado(int max, int[] resultado, int[] esperado) {
        if (Arrays.equals(resultado, esperado)) {
            System.out.println("Caso de prueba para max = " + max + " PASÓ");
        } else {
            System.out.println("Caso de prueba para max = " + max + " FALLÓ");
        }
    }

    public static int[] generarPrimos(int max) {
        // Implementación de la clase generarPrimos
        return new int[]{};
    }
}

