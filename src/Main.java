import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TIP le agregue la estructura repetitiva for para que repita todo el proceso hasta 5 veces.

        for (int i = 0; i < 5; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce tu Nombre y Apellidos");
            String nombreApellido = scanner.nextLine();

            System.out.println("Brindame la nota del primer examen");
            int nota1 = scanner.nextInt();

            System.out.println("Brindame la nota del segundo examen");
            int nota2 = scanner.nextInt();

            System.out.println("Brindame la nota del tercer examen");
            int nota3 = scanner.nextInt();

            int promedio = calcPromedio(nota1, nota2, nota3);

            //TIP Agrego if else para verificar que el promedio este dentro del rango (0-100), determinar si el
            // estudiante aprobó o no y además ya no tendria
            // que verificarlo en la clasificación.

            if (promedio > 100 || promedio < 0) {
                System.out.println("ERROR: asegurate de colocar bien las notas (0-100)");
            } else if (promedio >= 60 && promedio <= 100) {
                System.out.println("Estimado estudiante : " + nombreApellido + " , su promedio es" + promedio + ". ¡USTED APROBO!");
            } else if (promedio < 60 && promedio >= 0) {
                System.out.println("Estimado estudiante: " + nombreApellido + " . su promedio es" + promedio + ". USTED REPROBO..");
            }


            //TIP Aca seguia teniendo la duda sobre cual era la mayor nota. Asi seguí con que sea de 100, teniendo que agregar más validaciones.
            if (promedio >= 90 && promedio <= 100) {
                System.out.println("Excelente!");
            } else if (promedio >= 80 && promedio < 90) {
                System.out.println("Bueno");
            } else if (promedio >= 60 && promedio < 80) {
                System.out.println("Regular");
            } else if (promedio < 60 && promedio >= 0) {
                System.out.println("Reprobado");
            }
        }
    }

    public static int calcPromedio(int a, int b, int c) {
        int suma = a + b + c;
        return suma / 3;
    }
}