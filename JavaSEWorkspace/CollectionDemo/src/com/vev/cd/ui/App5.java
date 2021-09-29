package com.vev.cd.ui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class App5 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("oracle", 5000);
		map.put("python", 4900);
		map.put("java se", 5000);
		map.put("java ee", 6100);
		map.put("oracle", 5900);
		
		System.out.println(map);
		System.out.println(map.get("python"));
		
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("------------------------------------------------------");
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("oracle", 5000);
		map2.put("python", 4900);
		map2.put("java se", 5000);
		map2.put("java ee", 6100);
		map2.put("oracle", 5900);
		
		
		for(String key : map2.keySet()) {
			System.out.println(key + "\t" + map2.get(key));
		}
		System.out.println("------------------------------------------------------");
		
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("oracle", 5000);
		map3.put("python", 4900);
		map3.put("java se", 5000);
		map3.put("java ee", 6100);
		map3.put("oracle", 5900);
		map3.put("ruby", null);
		
		
		for(String key : map3.keySet()) {
			System.out.println(key + "\t" + map3.get(key));
		}
		System.out.println("------------------------------------------------------");
	}

}
