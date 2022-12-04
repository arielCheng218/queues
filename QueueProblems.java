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
	 * Counts in binary up to n. Result is printed.
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
	
	public static void zerosAndNines(int n) {
		System.out.println("When n is " + n);
		Queue<String> q = new LinkedList<>();
		
	}

	public static void main(String[] args) {
		// starbucks();
		generateBinaryNumber(in.nextInt());
//	zerosAndNines(in.nextInt());
		in.close();
	}
}