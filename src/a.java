import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	
        String s = "1 2 3 4 5";
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
