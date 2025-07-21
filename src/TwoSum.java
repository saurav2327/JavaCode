import java.util.Scanner;
 class Twosum {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array element:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        revesing of an array.
        for (int i=0;i<n/2;i++){
            int x=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=x;
        }
        System.out.println(" the reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Targeted index are arr follow: ");
//        Two sum of an array.
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(target==arr[i]+arr[j]){
                    System.out.println(i+" "+j);

                }
            }
        }
//        Printing max and minimum of an array.
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("MAx is : "+max+" Min is: "+min);




    }
}
