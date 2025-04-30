package Day3;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	QueueAsADT Q1 = new QueueAsADT(3);
	
	
	Q1.add(2);
	Q1.add(5);
	Q1.add(9);
	
	System.out.println(Q1.remove());
	System.out.println(Q1.remove());
	System.out.println(Q1);

	
}
}
