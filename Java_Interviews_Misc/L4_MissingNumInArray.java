public class L4_MissingNumInArray {
    public static void main(String[] args) {
        int a[] = {-1,1,2,4,5,7};
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i+1] != a[i] +1) {
                System.out.println(a[i]+1);
            }
        }

    }
}
