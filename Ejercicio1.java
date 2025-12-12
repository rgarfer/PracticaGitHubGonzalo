package tema5.tarea51;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        byte[] valor = new byte[5];
        
        valor[0] = 0;
        valor[1] = 1;
        valor[2] = 2;
        valor[3] = 3;
        valor[4] = 4;

        // Rellenar con valores aleatorios entre -128 y 127
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (byte) (Math.random() * 256 - 128);
        }

        // Nueva funcionalidad: mostrar los valores generados
        System.out.println("Valores aleatorios generados:");
        for (byte b : valor) {
            System.out.println(b);
        }
    }
}
