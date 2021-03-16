package MarcoRemon.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println( descOrder(999182831));


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
}




