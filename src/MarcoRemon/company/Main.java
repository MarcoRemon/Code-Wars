package MarcoRemon.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Object> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(33);
        numbers.add("22");
        numbers.add("3992");

        System.out.println(descOrder(sum(numbers)));

        testing(2);
        testing(3);
        testing(4);

        numeroImpar();
        

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

    public static void testing(int a){
        System.out.println("testing brancheo nomas.");
    }

    public static void numeroImpar() {

        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite numero:");

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n >= 1) {
            int last = n % 10;
            n=n/10;
            if (last % 2 != 0) {
                impares.add(last);
                System.out.println(last + " es impar. Se agrega a la lista.");
            }
            else System.out.println(last + " no es impar. No se agrega a la lista");
        }


        System.out.println("Los numeros impares son:");

        for (Integer impare : impares) {
            System.out.print(impare + " ");
        }


    }

}




