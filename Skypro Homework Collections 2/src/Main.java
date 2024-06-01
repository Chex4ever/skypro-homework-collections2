import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
		
		List<Integer> answer1 = new ArrayList<>();
		for (Integer integer : nums) {
			if (integer%2==1) {
				answer1.add(integer);
			}
		}
		System.out.println(answer1);
		
		List<Integer> answer2 = new ArrayList<>();
		Collections.sort(nums);
		for (Integer integer : nums) {
			if (integer%2==0 && !answer2.contains(integer)) {
				answer2.add(integer);
			}
		}
		System.out.println(answer2);
		
		List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
		Set<String> answer3 = new HashSet<>(strings);
		System.out.println(answer3);
		
		Map<String, Integer> answer4 = new HashMap<>();
		strings.forEach(string -> answer4.put(string, answer4.getOrDefault(string, 0) + 1));
		System.out.println(answer4);
	}
}
