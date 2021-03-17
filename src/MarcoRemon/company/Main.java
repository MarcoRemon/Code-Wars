package MarcoRemon.company;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        legajos();


    }

    public static int descOrder(int number) { // descending...

        String temp = String.valueOf(number);

        char[] desc = temp.toCharArray();

        Arrays.sort(desc);


        for (int i = 0; i < desc.length - 1; i++) {
            for (int j = i + 1; j < desc.length; j++) {
                if (desc[i] < desc[j]) {
                    char temp2 = desc[i];
                    desc[i] = desc[j];
                    desc[j] = temp2;
                }
            }
        }

        return Integer.parseInt(String.valueOf(desc));

    }


    public static int sum(List<Object> numbers) {


        int sum = 0;

        for (Object element : numbers) {
            if (element instanceof Integer) {
                sum += (Integer) element;
            } else if (element instanceof String) {
                sum += Integer.parseInt((String) element);
            }
        }
        return sum;

    }

    public static void testing(int a) {
        System.out.println("testing brancheo nomas.");
    }

    public static void numeroImpar() {

        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite numero:");

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n >= 1) {
            int last = n % 10;
            n = n / 10;
            if (last % 2 != 0) {
                impares.add(last);
                System.out.println(last + " es impar. Se agrega a la lista.");
            } else System.out.println(last + " no es impar. No se agrega a la lista");
        }


        System.out.println("Los numeros impares son:");

        for (Integer impare : impares) {
            System.out.print(impare + " ");
        }


    }

    public static void legajos() {
        System.out.println("Cuantos alumnos necesita comparar?");
        int numeroAlumnos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Comparando " + numeroAlumnos + " alumnos...");
        List<Alumno> alumnos = new ArrayList<>();
        int cuenta = 0;

        do {


            System.out.println("Indique el legajo del alumno numero " + (cuenta + 1));
            int legajo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese las notas del alumno:");

            System.out.print("Nota 1:");
            int nota1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nota 2:");
            int nota2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nota 3:");
            int nota3 = scanner.nextInt();
            scanner.nextLine();
            Alumno alumno = new Alumno(legajo, nota1, nota2, nota3);
            alumnos.add(alumno);
            cuenta++;

        } while (cuenta < numeroAlumnos);


       List<Alumno> sorted=alumnos.stream().sorted().collect(Collectors.toList());

       for (int i=0;i<sorted.size();i++){
           System.out.println(alumnos.get(i).getPromedio());
       }


    }

}




