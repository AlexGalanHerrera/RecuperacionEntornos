package ra3_4;

public class Recuperacion_RA3_RA4 {
    //metodo estatico
    public static int[] generarPrimos (int max)
    {
        //Declaración de las variables locales i y j de tipo int.
        int i,j;
        if (max >= 2) {

            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            // Inicializar el array
            for (i=0; i<dim; i++)
                esPrimo[i] = true;

            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;

            //Se marca el primer y segundo elemento del arreglo esPrimo como false, ya que el 0 y el 1 no son números primos.
            for (i=2; i<Math.sqrt(dim)+1; i++) {
                if (esPrimo[i]) {
                    // Eliminar los múltiplos de i
                    for (j=2*i; j<dim; j+=i)
                        esPrimo[j] = false;
                }
            }

            // Si esPrimo[i] es true, se marcan todos los múltiplos de i como false en el arreglo esPrimo, ya que no pueden ser primos.
            int cuenta = 0;
            for (i=0; i<dim; i++) {
                if (esPrimo[i])
                    cuenta++;
            }
            //Se cuenta la cantidad de números primos encontrados.
            int[] primos = new int[cuenta];
            for (i=0, j=0; i<dim; i++) {
                if (esPrimo[i])
                    primos[j++] = i;
            }

            return primos;

        } else { // max < 2

            return new int[0]; // Vector vacío
        }
    }
}
