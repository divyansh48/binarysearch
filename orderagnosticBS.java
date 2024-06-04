public class orderagnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 7;
        int ans = agnosticsearch(arr , target);
        System.out.println(ans);
    }

    static int agnosticsearch(int[] num , int target){
        int start = num[0];
        int end = num.length - 1;

        boolean isAsc = num[start] < num[end];


        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == num[mid]){
                return mid;

            }

            if (isAsc){
                if (target > num[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else {
                if (target < num[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }



        }
        return -1;
    }
}
