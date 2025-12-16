package PackageOne;

class ArrDemo {
    public int roll_no;
    public String name;

    ArrDemo(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {40, 55, 63, 17, 22};
        int n = arr.length;

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Ways of declaring array
        // 1. int arr[] OR int[] arr
        // 2.
        int a[] = new int[5];
        System.out.println("Length of array 'a': " + a.length);
        // 3.
        int[] v = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println("Length of array 'v': " + v.length);
        v[1] = 100;
        System.out.println(v[1]);

        // Array of objects
        ArrDemo[] st;
        st = new ArrDemo[5];

        st[0] = new ArrDemo(1, "aman");
        st[1] = new ArrDemo(2, "vaibhav");
        st[2] = new ArrDemo(3, "shikar");
        st[3] = new ArrDemo(4, "dharmesh");
        st[4] = new ArrDemo(5, "mohit");

        for(int i=0;i<st.length;i++){
            System.out.println("Element at " + i + " : { "
                    + st[i].roll_no + " "
                    + st[i].name+" }");
        }

        // If we try to access elements outside the array size, JVM throws ArrayIndexOutOfBoundsException
        // System.out.println(arr[5]);


    }
}
