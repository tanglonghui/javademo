public class Demo_1 {
    public static void main(String[] args) {
//        int[] A={1,1,2,2,3,4,4};
//        System.out.println( singleNumber(A));
        char a='a';
        System.out.println(lowercaseToUppercase(a));
    }
    public static int singleNumber(int[] A) {
        // write your code here
        int r=0;
        for(int i=0;i<A.length;i++){
            r=A[i];
            for(int j=0;j<A.length;j++){
                if(r==A[j]){
                    break;
                }
                if(j==A.length){
                    return r;
                }
            }
        }
        return r;
    }
    public static char lowercaseToUppercase(char character) {
        // write your code here
        String str=""+character;
        str=str.toUpperCase();
        return str.charAt(0);
    }
}
