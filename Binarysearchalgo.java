public class Binarysearchalgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        int ans = bs(arr , target);
        System.out.println(ans);
    }

    static int bs(int[] num , int target){
        int start = num[0];
        int end = num.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > num[mid]){
                start = mid + 1;
            }
            else if (target < num[mid]){
                end = mid - 1;
            }
            else{
                return mid;

            }
        }
        return -1;
    }
}
