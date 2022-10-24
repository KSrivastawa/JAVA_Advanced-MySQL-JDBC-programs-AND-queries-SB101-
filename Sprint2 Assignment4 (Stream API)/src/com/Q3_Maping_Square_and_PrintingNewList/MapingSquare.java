package com.Q3_Maping_Square_and_PrintingNewList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapingSquare {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(7,41,8,9,6,5,4,26);
		
		System.out.print("Original List: ");
		integers.forEach(t-> System.out.print(t+" "));
		
		List<Integer> newList = integers.stream().map(s-> s*s).collect(Collectors.toList());
		
		System.out.println("\nNew Square List: "+ newList);
		

	}

}
