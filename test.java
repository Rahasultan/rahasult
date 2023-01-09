import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        a5 a=new a5(3);
        a4 e1=new a4("v",100);
        a4 e2=new a4("a",90);
        a4 e3=new a4("s",95);
        a4 e4=new a4("q",120);
        a4 e5=new a4("g",50);
        a4 e6=new a4("j",200);
        a.add(e1);
        System.out.println(Arrays.toString(a.getBoard()));
        a.add(e2);
        System.out.println(Arrays.toString(a.getBoard()));
        a.add(e3);
        System.out.println(Arrays.toString(a.getBoard()));
        a.add(e4);
        System.out.println(Arrays.toString(a.getBoard()));
        a.add(e5);
        System.out.println(Arrays.toString(a.getBoard()));
        a.add(e6);
        System.out.println(Arrays.toString(a.getBoard()));
        System.out.println(a.remove(0)+"remove");
        System.out.println(Arrays.toString(a.getBoard()));

    }
}
