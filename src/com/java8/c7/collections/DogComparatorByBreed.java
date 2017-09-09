package com.java8.c7.collections;

import java.util.Comparator;

public class DogComparatorByBreed implements Comparator<Dog>{

	@Override
	public int compare(Dog d1, Dog d2) {
		int result = d1.getBreed().compareTo(d2.getBreed());

        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
	}

}
