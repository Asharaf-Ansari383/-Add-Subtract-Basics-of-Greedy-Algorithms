import java.util.*;
class Add_Substract
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int t =  scan.nextInt();
        while(t-- > 0)
        {
            int N =  scan.nextInt();
            int K =  scan.nextInt();
            int arr[] = new int[N];
            for(int i = 0;i<N;i++)
              arr[i] = scan.nextInt();
            int mincost = Integer.MAX_VALUE;  
            for(int i=1;i<=100;i++)
			{
				int cost[]=new int[N];
				for(int j=0;j<N;j++){
					if(arr[j]>i)
					  cost[j]=(arr[j]-i)*5;
					else 
						cost[j]=(i-arr[j])*3;
				}
				Arrays.sort(cost);
				int totalcost=0;
				for(int j=0;j<K;j++)
					totalcost+=cost[j];		
				mincost=Math.min(mincost,totalcost);
			}
            System.out.println(mincost);  
        }
    }
}
