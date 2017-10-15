package com.java8.c7.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		practiceWithLists();
		practiceWithDeques();
		practiceWithSets();
		practiceWithMaps();
		practiceWithMultiMaps();
		practiceWithComparable();
		practiceWithComparator();
		practiceWithComparatorJava8();
	}
	
	private static void practiceWithLists(){
		System.out.println("*******LIST SECTION*******");
		
		List genericList = new ArrayList();
		genericList.add("element");
		genericList.add(23);
		genericList.add(new Dog("German Shepherd", "Laika", 2));
		System.out.println("List size: " + genericList.size());
		System.out.println("First element of the list: " + genericList.get(0));
		System.out.println("Second element of the list: " + genericList.get(1));
		for(Object element: genericList){
			System.out.print(String.format("%s ", element));
		}
		System.out.println();
		
		List<String> stringList = new LinkedList<>();
		stringList.add("first");
		stringList.add("second");
		stringList.add("third");
		//stringList.add(2); // Not allowed because the Elements of the String are declared as String
		stringList.remove(1);
		System.out.println(stringList);
		
		System.out.println();
	}
	
	private static void practiceWithDeques(){
		System.out.println("*******DEQUE SECTION*******");
		Deque<String> stack = new ArrayDeque<>(); // use methods push y pop
        Deque<String> queue = new ArrayDeque<>(); // use methods add y remove

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        while (!stack.isEmpty())
            System.out.println(stack.pop());

        System.out.println();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        while (!queue.isEmpty())
            System.out.println(queue.remove());
        
        System.out.println();
        
        Deque<String> deque = new ArrayDeque<>();
        
        deque.add("A");
        deque.addFirst("B");
        deque.addLast("C");
        deque.add("D");
        
        System.out.println(deque);
        
        deque.removeFirst();
        deque.removeLast();
        
        System.out.println(deque);
		System.out.println();
	}
	
	private static void practiceWithSets(){
		System.out.println("*******SET SECTION*******");
		Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        String[] palabras = { "i", "came", "i", "saw", "i", "left" };

        for (String cadena : palabras) {
            hashSet.add(cadena);
            treeSet.add(cadena);
            linkedHashSet.add(cadena);
        }

        System.out.println(hashSet); // ordered by hash
        System.out.println(treeSet); // ordered set
        System.out.println(linkedHashSet); // ordered as how elements were introduced
		System.out.println();
	}
	
	private static void practiceWithMaps(){
		System.out.println("*******MAP SECTION*******");
		//Map<K key, V value>
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> hashTable = new Hashtable<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        String[] palabras = { "if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate" };

        for (String cadena : palabras) {
            Integer freq;

            freq = hashMap.get(cadena); //regresa el valor (value Integer) de esa llave si esta, si no regresa null
            hashMap.put(cadena, (freq == null) ? 1 : freq + 1); //se agrega (key, value)

            freq = hashTable.get(cadena);
            hashTable.put(cadena, (freq == null) ? 1 : freq + 1);

            freq = treeMap.get(cadena);
            treeMap.put(cadena, (freq == null) ? 1 : freq + 1);

            freq = linkedHashMap.get(cadena);
            linkedHashMap.put(cadena, (freq == null) ? 1 : freq + 1);
        }

        printMap(hashMap);       // ordered by hash according to the key, hashMap also accept null keys and don't is thread safe
        printMap(hashTable);     // ordered by hash according to the key, hashTable don't accept null keys and is thread safe
        printMap(treeMap);       // ordered alphabetically according to the key
        printMap(linkedHashMap); // ordered as how elements were introduced
		System.out.println();
	}
	
	private static void printMap(Map<String, Integer> map){
		System.out.println(map.getClass().getSimpleName());
        System.out.println(map.size() + " different words");
        System.out.println(map);
        System.out.println();
	}
	
	private static void practiceWithMultiMaps(){
		System.out.println("*******MULTMAP SECTION*******");
		Map<Integer, List<String>> multimap = new HashMap<>();

        List<String> values1 = Arrays.asList("one", "two", "three");
        List<String> values2 = Arrays.asList("four", "five");
        List<String> values3 = Arrays.asList("six", "seven", "eight", "nine");

        multimap.put(1, values1); // add key(K) and values(V)
        multimap.put(2, values2);
        multimap.put(3, values3);

        for (Integer key : multimap.keySet()) {
            System.out.println(key);   // print the keys
        }
        System.out.println();

        for (List<String> list : multimap.values()) {
            System.out.println(list); // print values
        }
        System.out.println();

        for (Map.Entry<Integer, List<String>> map : multimap.entrySet()) {
            System.out.printf("%s = %s \n", map.getKey(), map.getValue()); // print key = value
        }
		System.out.println();
	}
	
	private static void practiceWithComparable(){
		System.out.println("*******COMPARABLE SECTION*******");
		Set<DogComparableByBreed> dogSet1 = new TreeSet<>();

        dogSet1.add(new DogComparableByBreed("German Shepherd", "Laika", 2));
        dogSet1.add(new DogComparableByBreed("Akita", "Hachi", 10));
        dogSet1.add(new DogComparableByBreed("German Shepherd", "Togoe", 6));

        for (DogComparableByBreed dog : dogSet1) {
            System.out.println(dog);
        }
        System.out.println();
        
		Set<DogComparableByName> dogSet2 = new TreeSet<>();

        dogSet2.add(new DogComparableByName("German Shepherd", "Laika", 2));
        dogSet2.add(new DogComparableByName("Akita", "Hachi", 10));
        dogSet2.add(new DogComparableByName("German Shepherd", "Togoe", 6));

        for (DogComparableByName dog : dogSet2) {
            System.out.println(dog);
        }
        System.out.println();

        Set<DogComparableByAge> dogSet3 = new TreeSet<>();

        dogSet3.add(new DogComparableByAge("German Shepherd", "Laika", 2));
        dogSet3.add(new DogComparableByAge("Akita", "Hachi", 10));
        dogSet3.add(new DogComparableByAge("German Shepherd", "Togoe", 6));

        for (DogComparableByAge dog : dogSet3) {
            System.out.println(dog);
        }
		System.out.println();
	}
	
	private static void practiceWithComparator(){
		System.out.println("*******COMPARATOR SECTION*******");
		List<Dog> dogList = new ArrayList<>(3);
        Comparator<Dog> sortBreed = new DogComparatorByBreed();
        Comparator<Dog> sortName = new DogComparatorByName();
        Comparator<Dog> sortAge = new DogComparatorByAge();

        dogList.add(new Dog("German Shepherd", "Laika", 2));
        dogList.add(new Dog("Akita", "Hachi", 10));
        dogList.add(new Dog("German Shepherd", "Togoe", 6));

        Collections.sort(dogList, sortBreed); // Collections.sort(List,Comparator)
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        System.out.println();

        Collections.sort(dogList, sortName);
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        System.out.println();

        Collections.sort(dogList, sortAge);
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
		System.out.println();
	}
	
	private static void practiceWithComparatorJava8(){
		System.out.println("*******COMPARATOR JAVA 8 SECTION*******");
		List<Dog> dogList = new ArrayList<>(3); 
        dogList.add(new Dog("German Shepherd", "Laika", 2));
        dogList.add(new Dog("Akita", "Hachi", 10));
        dogList.add(new Dog("German Shepherd", "Togoe", 6));

        dogList.sort( (d1, d2) -> d1.getBreed().compareTo(d2.getBreed()) ); // list.sort(Comparator)
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        System.out.println();

        dogList.sort( (d1, d2) -> d1.getName().compareTo(d2.getName()) );
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        System.out.println();

        dogList.sort( (d1, d2) -> d1.getAge().compareTo(d2.getAge()) );
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
		System.out.println();
	}
	
}
