package Number_Problems;

public class HcfLcm {
    public static void main(String[] args) {
        System.out.println(lcm(5,11));
    }
    private static int lcm(int x, int y) {
        return (x*y)/hcf(x,y);
    }
    private static int hcf(int x, int y) {
        if(y==0)return x;
        return hcf(y,x%y);
    }
    //for more than 3 or more numbers;

//    private static int hcfOfArray(int []arr){
//        int result=arr[0];
//        for(int i=1;i<arr.length;i++){
//            result=hcf(result,arr[i]);
//        }
//        return result;
//    }
//    private static int lcmOfArray(int[]arr){
//        int result = arr[0];
//        for(int i=0;i<arr.length;i++){
//            result=lcm(result,arr[i]);
//        }
//        return result;
//    }
}
