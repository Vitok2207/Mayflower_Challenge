import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	
        String s = "1 9 3 4 -5";
        String[] s_array = s.split(" ");
        int[] i_array = new int[s_array.length];
        for(int i = 0; i < s_array.length; i++){
            i_array[i] = Integer.parseInt(s_array[i]);
        }
        Arrays.sort(i_array);

		for(int i = 0; i < i_array.length; i++){
		//	System.out.println(i_array[i]);
		}

        System.out.print(i_array[i_array.length-1]);
        System.out.print(" " + i_array[0]);
    }
}

/*
Eine weitere Methode um das Ergebnis zu bekommen.

public class Main {
    
  public static void main(String[] args) {

    int numbers[] = new int[]{1, 9, 3, 4, -5};
    int smallest = numbers[0];
    int biggest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > biggest)
            biggest = numbers[i];
        else if (numbers[i] < smallest)
            smallest = numbers[i];
    }

        System.out.print(biggest);
        System.out.print(" " + smallest)
  }
}    
*/    
