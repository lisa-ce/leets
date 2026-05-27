
//rotate an array


//public class Main {
//    public static void main(String[] args) {
//
//        int[] nums = {4, 3, 2, 6};
//
//        int n = nums.length;
//        int totalSum = 0;
//        int currentF = 0;
//
//        // Calculate total sum and F(0)
//        for (int i = 0; i < n; i++) {
//            totalSum += nums[i];
//            currentF += i * nums[i];
//        }
//
//        int max = currentF;
//
//        // Calculate other rotation values
//        for (int k = 1; k < n; k++) {
//            currentF = currentF + totalSum - n * nums[n - k];
//            max = Math.max(max, currentF);
//        }
//
//        System.out.println(max);
//    }
//}


//leet 2
//
//public class Main {
//    public static void main(String[] args) {
//int n=10;
//int count=0;
//
//
//for(int i=1;i<=n;i++){
//    int num=i;
//    boolean changed=false;
//    boolean valid=true;
//    while(num>0){
//        int digit=num%10;
//
//        if(digit==3 || digit==4 || digit==7){
//            valid=false;
//            break;
//
//        }
//        if(digit==2 || digit==6 || digit==9){
//            changed=true;
//        }
//        num=num/10;
//    }
//    if(valid && changed){
//        count++;
//    }
//        System.out.println(count);
//}
//    }


//leet 3






















