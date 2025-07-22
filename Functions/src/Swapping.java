public class Swapping {
    public static void main(String[] args) {
        int []arr={10,12};
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);

    }
    static void swap(int [] nums){
        int temp=nums[0];
        nums[0]=nums[1];

        nums[1]=temp;

    }
}
