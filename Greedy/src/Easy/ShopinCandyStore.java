package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopinCandyStore {
	static ArrayList<Integer> candyStore(int candies[],int N,int K){
		ArrayList<Integer> al=new ArrayList<>();
		Arrays.sort(candies);

		int min=0;
		int buy=0;
		int free=N-1;
		while(buy<=free){
			min=min+candies[buy];
			buy++;
			free=free-K;
		}

		int max=0;
		buy=N-1;
		free=0;
		while(free<=buy){
			max=max+candies[buy];
			buy--;
			free=free+K;
		}
		al.add(min);
		al.add(max);
		return al;
	}



	public static void main(String[] args) {
		int N = 4;
		int K = 2;
		int candies[] = {3 ,2 ,1, 4};
		System.out.println(candyStore(candies, N, K));
	}
}
