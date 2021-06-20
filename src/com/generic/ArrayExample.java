package com.generic;

public class ArrayExample<a,b,c> {
	a[] myaArray;
	b[] mybArray;
	c[] mycArray;
	
	public ArrayExample(a[] myaArray, b[] mybArray, c[] mycArray) {
		this.myaArray = myaArray;
		this.mybArray = mybArray;
		this.mycArray = mycArray;
	}
	
	public static void main(String args []) {
		Integer[] intArray = {10, 20, 30, 40, 50};
		Double[] doubleArray = {10.10, 20.20, 30.30, 40.40, 50.50};
		Character[] charArray = {'m', 'n', 'o', 'p', 'q' };
		
		new ArrayExample<Integer,Double,Character>(intArray,doubleArray,charArray).toPrint();
		
	}
	
	private void toPrint() {
		toPrint(myaArray);
		toPrint(mybArray);
		toPrint(mycArray);
	}
	
	private static <E> void toPrint(E[] intArray) {
		for(E element : intArray ) {
			System.out.println(element);
		}
		System.out.println();
	}
}
