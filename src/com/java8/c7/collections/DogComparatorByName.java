package com.java8.c7.collections;

import java.util.Comparator;

public class DogComparatorByName implements Comparator<Dog>{

	@Override
	public int compare(Dog d1, Dog d2) {
		int result = d1.getName().compareTo(d2.getName());

        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
	}
}
