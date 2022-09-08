package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Nmeetingsinoneroom {
	/*
	There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i]) where start[i] is start time of meeting i and end[i] is finish time of meeting i.
	What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time?

	Note: Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.


	Example 1:

	Input:
	N = 6
	start[] = {1,3,0,5,8,5}
	end[] =  {2,4,6,7,9,9}
	Output: 
	4
	Explanation:
	Maximum four meetings can be held with
	given start and end timings.
	The meetings are - (1, 2),(3, 4), (5,7) and (8,9)
	 */

	static class Pair {
		int start;
		int end;

		Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	public static int maxMeetings(int start[], int end[], int n){
		ArrayList<Pair> list = new ArrayList<>();    

		for(int i=0;i<n;i++) {
			list.add(new Pair(start[i], end[i]));
		}

		Collections.sort(list, (p1, p2) -> p1.end - p2.end);

		int res = 1;
		int prev = 0;

		for(int i=1;i<n;i++) {
			if(list.get(i).start > list.get(prev).end) {
				res++;
				prev = i;
			}
		}
	
		return res;
	}

	public static void main(String[] args) {
		int N = 6;
		int start[] = {1,3,0,5,8,5};
		int end[] =  {2,4,6,7,9,9};
		System.out.println(maxMeetings(start, end, N));
	}
}
