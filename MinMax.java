public class MinMax {
    public static int[] getMinMaxNum(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int[] returns = new int[2];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]< min){
                min=arr[i];
            }
            if(arr[i]> max){
                max=arr[i];
            }
        }
        returns[0]=min;
        returns[1]=max;
        return returns;
    }
    public static void main(String[] args){
        int[] arr = {3,5,8,9,0,1};
        int[] result = getMinMaxNum(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
