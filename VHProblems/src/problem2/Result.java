package problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Result {
	public static int countMeetings(List<Integer> firstDay, List<Integer> lastDay) {
//		if(firstDay.size()!=lastDay.size()) {
//			return 0;
//		}else {
//			if(firstDay.size()==1) {
//				return 1;
//			}
//			List<Integer> allDays = new ArrayList<Integer>(firstDay);
//			allDays.addAll(lastDay);
//			Set<Integer> fdSet = new HashSet<Integer>(allDays);
//			return fdSet.size();
//		}	
		int result = 0;

		if (firstDay.size() != lastDay.size()) {
			return result;
		} else {

			TreeMap<Integer, Map<Integer, Integer>> treeMap = new TreeMap<>();
			for (int i = 0; i < firstDay.size(); i++) {
				treeMap.putIfAbsent(firstDay.get(i), new HashMap<>());
				Map<Integer, Integer> map = treeMap.get(firstDay.get(i));
				map.put(lastDay.get(i), map.getOrDefault(lastDay.get(i), 0) + 1);
			}
			List<int[]> list = new ArrayList<>();
			for (Map.Entry<Integer, Map<Integer, Integer>> entry : treeMap.entrySet()) {
				for (Map.Entry<Integer, Integer> endEntry : entry.getValue().entrySet()) {
					list.add(new int[] { entry.getKey(), endEntry.getKey(),
							Math.min(endEntry.getKey() - entry.getKey() + 1, endEntry.getValue()) });
				}
			}
			int[] first = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				int[] current = list.get(i);
				if (current[0] > first[1]) {
					result += Math.min(first[1] - first[0] + 1, first[2]);
					first = current;
				} else {
					first[1] = Math.max(first[1], current[1]);
					if (first[2] + current[2] > first[1] - first[0] + 1)
						first[2] = first[1] - first[0] + 1;
					else
						first[2] += current[2];
				}
			}
			result += Math.min(first[1] - first[0] + 1, first[2]);
			return result;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 3, 3 };
		int[] arr2 = { 2, 2, 3, 4, 4 };
		List<Integer> firstDay = new ArrayList<Integer>();
		List<Integer> lastDay = new ArrayList<Integer>();
		for (int i : arr1) {
			firstDay.add(i);
		}

		for (int i : arr2) {
			lastDay.add(i);
		}

		System.out.println(countMeetings(firstDay, lastDay));
	}
}
