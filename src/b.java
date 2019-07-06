public class b {
    static {

        int numbers[] = new int[]{1, 2, -3, 4, 5};
        int smallest = numbers[0];
        int biggest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest)
                biggest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        System.out.print(biggest);
        System.out.print(" " + smallest);
    }
}
