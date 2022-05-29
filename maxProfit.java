import java.io.*;

class MaxProfit 
{
    static int maxProfit(int prices[], int size)
    {    
        int maxProfit = 0;
        int cal=0;
for(int k=0;k<size-1;k++){
         for(int i=k+1;i<size;i++){
             if(prices[k]<prices[i]){
             cal=prices[i]-prices[k];
             if(cal>maxProfit){
             maxProfit=cal;
                }
             }
          }
    }
     return maxProfit;
    }
    public static void main(String[] args)
    {    
       
        int price[] = {7,1,5,3,6,4};
        int n = price.length;
        System.out.println(maxProfit(price, n));
    }
}