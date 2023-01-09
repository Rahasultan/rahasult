public class a2 {

        public static void main(String[] args) {
            int []num_array={1,5,8,9,88,77};
            int []clone_array =num_array.clone();
            System.out.println("original num_array:");
            for (int i = 0; i < num_array.length; i++) {
                System.out.println(num_array[i]+" ");
            }
            System.out.println();
            System.out.println("clound num_array: ");
            for (int i = 0; i < clone_array.length; i++) {
                System.out.println(clone_array[i]+" ");
            }
            System.out.println("\n");
//        System.out.print("num_array==clount_array ");
//        System.out.println(num_array==clone_array);
        }}

