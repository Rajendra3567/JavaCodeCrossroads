public class L7_TableIndex {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 01;

        for(int i=2; i<n;i++) {
            String currentElement = String.valueOf(arr[i-1]);
            char ch[] = currentElement.toCharArray();
            String result = "";
            for(int j=0;j<ch.length;j++) { // 0,1
                if(ch[j] == '0') {
                    result += "01";
                } else if(ch[j] == '1') {
                    result += "10";
                }
            }
            System.out.println(result);
//            String str = String.valueOf(arr[i]);
//            arr[3] = arr[i] + new StringBuilder(str).reverse();
        }
    }
}
