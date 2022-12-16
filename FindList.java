import java.util.Arrays;

public class FindList {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 9, 0, 2, 8, 0, 9 };
        int count = 0;
        int numb = 0;
        int max = 0;
        int i;
        int j;

        System.out.println(Arrays.toString(arr));

        for (i = 0; i < arr.length; i++){
            count = 1;
            
            for(j = i+1; j < arr.length; j++){
                numb = arr[i];

                if(arr[i]==arr[j] && (j != i)){
                    count++;
                }        
            }
            if((max <= count) && (count != 1)){
                max = count;
                System.out.println("Число:" + numb + ", встречается:" + max ); 
            }

        }
        if(max == 0){
            System.out.println("Числа не повторяются");
        }
    }
}