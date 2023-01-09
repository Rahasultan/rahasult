import java.util.Arrays;

public class a7 {
    public static void main(String[] args) {
        int []array1={1,6,9,3};
        int []array2={12,13,16,19};
        int length= array1.length + array2.length;
        int []result=new int[length];
        int pos=0;
        for (int element:array1
        ) { result[pos]=element;
            pos++;
        }
        for (int element:array2
        ) { result[pos]=element;
            pos++;
        }
        System.out.println("result is " + Arrays.toString(result));
    }
}
