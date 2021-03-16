package MarcoRemon.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(33);
        numbers.add("22");
        numbers.add("3992");

        System.out.println(descOrder(sum(numbers)));

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

}




