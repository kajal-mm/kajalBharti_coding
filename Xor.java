import java.io.*;

class FindXor 
{
    public static int getXor(int nums[], int y) {
        int xor=0;
        if(y==3){
         xor=(nums[0]^nums[1]^nums[2]);
        }else xor=0;
        int k=0;
        int cal=0;

     for(int i=0;i<y;i++){
         k=k+nums[i];
     }
     
     for(int m=0;m<y-1;m++){
         for(int n=1;n<y;n++){
             cal=nums[m]^nums[n];
             k=k+cal;
         }
     }
   k=k+xor;
  return k;
}
    public static void main(String[] args)
    {    
       
        int nums1[] = {1,3};
        int n = nums1.length;
        int nums2[] = {5,1,6};
        int kl = nums2.length;
        System.out.println(getXor(nums1, n));
        System.out.println(getXor(nums2, kl));
    }
}
