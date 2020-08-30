package stack_permutation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class stack_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the length of stack:-");
		Scanner in  = new Scanner(System.in);
		n = in.nextInt();
		
		int[] checkPermutation = new int[n];
		System.out.println("Enter one element then press enter to enter next element:");
		for(int i = 0; i<n; i++) {
			checkPermutation[i]= in.nextInt();
		}
		stackPermutation(n, checkPermutation);
	}

	private static void stackPermutation(int n, int[] checkPermutation) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int j =0;
		// TODO Auto-generated method stub
		for(int i= 1; i<= n; ++i) {
			stack.push(i);
			System.out.println("Stack push " + i);
			while(stack.peek() == checkPermutation[j]) {
				System.out.println("Stack pop "+ stack.peek());
				stack.pop();
				j++;
				if(stack.isEmpty()) {
					break;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("Provided stack is stack permutation");
		}else {
			System.out.println("Provided stack is not stack permutation as to get " +checkPermutation[j]+ " we have to remove " + stack.peek()+ " and we won't get correct order");
		}
	}

}
