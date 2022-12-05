package queues;
import java.io.*;
import java.util.*;

public class QueueProblems {
	
	static Scanner in = new Scanner(System.in);

	public static void starbucks() {
		Queue<String> q = new LinkedList<>();
		System.out.println("input in + item name to add item in line or out to see next item:");
		boolean endOfDay = false;
		while (!endOfDay) {
			String str = in.nextLine();
			if (str.equals("6pm")) {
				endOfDay = true;
			} else if (str.equals("in")) {
				System.out.println("Input your order");
				q.add(in.next());
				System.out.println(in.nextLine());
			} else if (str.equals("out")) {
				if (q.isEmpty()) {
					System.out.println("The line is empty");
				} else {
					System.out.println(q.poll());
				}
			}
		}
		System.out.println("see you tmr");
	}

	/**
	 * Counts in binary from 1 to n. Result is printed.
	 * @param n
	 */
	public static void generateBinaryNumber(int n) {
		System.out.println("Count up to " + n + " in binary");
		Queue<String> q = new LinkedList<>();
		String baseNum = "1";
		boolean appendOne = false;
		q.add("1");
		System.out.println("1");
		for (int i = 0; i < n - 1; i++) {
			if (i % 2 == 0)
				baseNum = q.poll();
			String appendNum = appendOne ? "1" : "0";
			String fullNum = baseNum + appendNum;
			System.out.println(fullNum);
			q.add(fullNum);
			appendOne = !appendOne;
		}
	}

	/**
	 * Calculates and prints the least positive 
	 * integer x that is a multiple of n and 
	 * whose digits are only zeros or nines.
	 * @param n
	 */

	 // TODO code cleanup
	
	public static void zerosAndNines(int n) {
		Queue<String> q = new LinkedList<>();
		if (n == 0) {
			System.out.println("No number can satisfy that requirement.");
		}
		int i = 0;
		String x = "9";
		String baseNum = "9";
		boolean appendNine = false;
		q.add("9");
		if (9 % n == 0) {
			System.out.println(9);
			return;
		}
		while (Integer.valueOf(x) % n != 0) {
			if (i % 2 == 0)
				baseNum = q.poll();
			String appendNum = appendNine ? "9" : "0";
			x = baseNum + appendNum;
			q.add(x);
			appendNine = !appendNine;
			i++;
		}
		System.out.println(x);
	}

	public static void main(String[] args) {
		// starbucks();
		// generateBinaryNumber(in.nextInt());
		zerosAndNines(in.nextInt());
		in.close();
	}
}