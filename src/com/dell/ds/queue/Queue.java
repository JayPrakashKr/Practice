package com.dell.ds.queue;

class QueueUsingArray{
    int front_Q,rear_Q,capacity_Q;
    int[] qArray;
    QueueUsingArray(int size){
        capacity_Q=size;
        qArray = new int[capacity_Q];
    }

    public void enqueue(int value){
        if(rear_Q==capacity_Q){
            System.out.println("Queue is already full, No more element can be added");
        }else{
                qArray[rear_Q]=value;
                rear_Q++;
        }
    }

    public void dequeue(){
        if(rear_Q==front_Q){
            System.out.println("Queue is empty, Nothing to delete");
        }
        else{
            for(int i=0;i<rear_Q-1;i++){
                qArray[i]=qArray[i+1];
            }
            rear_Q--;
        }
    }

    public void display(){
        if(rear_Q==front_Q){
            System.out.println("Queue is empty, Nothing to display");
        }
        else{
            for(int i=0;i<rear_Q;i++){
                System.out.print(qArray[i]+" ");
            }
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueUsingArray usingArray = new QueueUsingArray(5);
        usingArray.enqueue(2);
        usingArray.enqueue(4);
        usingArray.enqueue(6);
        usingArray.enqueue(8);
        usingArray.display();
        usingArray.dequeue();
        System.out.println();
        usingArray.display();
    }
}
