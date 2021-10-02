package com.vev.sd.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.vev.sd.pojo.Item;
import com.vev.sd.pojo.ItemCategory;

public class App4 {

	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<> (
				Arrays.asList(
					new Item(101, "Apples", 250, LocalDate.of(2020,10,25), ItemCategory.READY_TO_EAT),
					new Item(102, "Mangos", 350, LocalDate.of(2020,8,23), ItemCategory.READY_TO_EAT),
					new Item(104, "Green Apples", 450, LocalDate.of(2020, 9, 30), ItemCategory.READY_TO_EAT),
					new Item(103, "Litchie", 550, LocalDate.now(), ItemCategory.READY_TO_EAT),
					new Item(106, "Sprite", 80, LocalDate.now(), ItemCategory.BEVERAGE),
					new Item(106, "Diet Coke", 75, LocalDate.now(), ItemCategory.BEVERAGE),
					new Item(106, "Red Bull", 90, LocalDate.now(), ItemCategory.BEVERAGE)
				)
		);
		
		itemList.stream().forEach(System.out::println);
		System.out.println("---------------------------------------------");
		
		List<String> itemNames = itemList.stream()
				.map(i -> i.getName())
				.collect(Collectors.toList());
		System.out.println(itemNames);
		System.out.println("---------------------------------------------");
		
		/* costly item */
		Item costliestItem = itemList.stream()
			.reduce((item1, item2)->(item1.getPrice() > item2.getPrice() ? item1 : item2))
			.orElse(null);
		System.out.println(costliestItem);
		
		/* another way - without OrElse */
		Optional<Item> cheaperItem = itemList.stream()
				.reduce((item1, item2)->(item1.getPrice() < item2.getPrice() ? item1 : item2));
		if (cheaperItem.isPresent()) {
			System.out.println(cheaperItem);
		} else {
			System.out.println("No such item");
		}
		
		System.out.println("---------------------------------------------");
		itemList.stream()
				.sorted()
				.forEach(System.out::println);
		System.out.println("---------------------------------------------");

	}

}
