package datastructures.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(2, 3));
		intervals.add(new Interval(2, 2));
		intervals.add(new Interval(3, 3));
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(5, 7));
		intervals.add(new Interval(2, 2));
		intervals.add(new Interval(4, 6));
		
		intervals = merge(intervals);
		
		for(int i = 0; i < intervals.size(); i++) {
			System.out.println(intervals.get(i));
		}
	}
	
	/**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
	public static List<Interval> merge(List<Interval> intervals) {
		Comparator<Interval> comperator = new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return (o1.start - o2.start) + (o1.end - o2.end);
			}
		};
		
		Collections.sort(intervals, comperator);
		// write your code hereer
		for (int i = 1; i < intervals.size(); i++) {
			Interval in1 = intervals.get(i - 1);
			Interval in2 = intervals.get(i);

			if (in1.end >= in2.start) {
				in1 = new Interval(Math.min(in1.start, in2.start), Math.max(in1.end, in2.end));
				intervals.set(i - 1, in1);
				intervals.remove(i);
				i = 0;
			}

		}

		return intervals;
	}
}

class Interval {
	int start, end;
	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
	
}