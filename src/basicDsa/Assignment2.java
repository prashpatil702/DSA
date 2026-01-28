package basicDsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment2 {

	public static void main(String[] args) {
		// Remove spaces, empty strings and null from string array and return string array
		String[] names = {"Prashant","Rahul","","  ","Suraj",null};
		String[] finalList = Arrays.stream(names).filter(obj -> !Objects.isNull(obj)).filter(name -> !name.isBlank()).toArray(String[]::new);
		
		for(String s:finalList)
		{
			System.out.print(s+" ");
		}
		
		System.out.println("========================");
		
		// aaabbccd -> a3b2c2d1
		
		String input = "aaabbccd";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<input.length();i++)
		{
			if(hm.containsKey(input.charAt(i)))
			{
				hm.put(input.charAt(i),hm.get(input.charAt(i))+1);
			}
			else
			{
				hm.put(input.charAt(i),1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("========================");
		
		// Same problem with streams api
		
		Map<Character, Long> map = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		for(Map.Entry<Character,Long> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		List<String> fruits = Arrays.asList("Apple","Banana","Orange");
		
		Stream<String> stream = fruits.stream().map(f -> f.toUpperCase());
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		
		
	}

}
