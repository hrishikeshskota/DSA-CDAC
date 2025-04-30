package Day3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAsADT {
int [] data;
int ptr = -1;
int ptr2 = -1;

QueueAsADT(){} 

QueueAsADT(int size){
	this.data = new int[size];
}

boolean add(int item) {
	if(isFull()) {
		System.out.println("Arry is full");
		return false;
	}
	
	if(ptr2==-1) {
		ptr2=0;
	}
	
	ptr++;
	data[ptr] = item;
	return true;
	
}

private boolean isFull() {
	return ptr == data.length-1;
}

int remove() {
	      if(isEmpt()) {
	    	  System.out.println("Queue is empty");
	    	  return -1;
	      }
	      
	      int removed = data[ptr2 + 1]; 
	      data[ptr2]=0;
	        ptr2++; 
	        return removed;      	
}


private boolean isEmpt() {
	return ptr2 == ptr ;
}


@Override
public String toString() {
	return "QueueAsADT [data=" + Arrays.toString(data) + "]";
}


}
