package Generic;

import java.util.Arrays;

public class CustomQueue {
    int[] arr;
    int rear = -1;
    int front = -1;


     CustomQueue(){};
     CustomQueue(int size){
         arr = new int[size];
     }

     boolean enqueue(int num){
         if(isFul()){
             System.out.println("Array is full");
             return false;
         }
         rear++;
         arr[rear]=num;
         if(front ==-1){
             front=0;
         }
         return true;
     }

     int dequeue(){
         if(isEmpt()){
             System.out.println("Array is empty");
             return -1;
         }

         int removed = arr[front];
         arr[front]=0;
         front ++;

         return removed;
     }

    private boolean isEmpt() {
        return front == -1;
    }

    private boolean isFul() {
         return rear == arr.length-1;
    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
