
package dsa.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class minheap {

  public void main(String[] args){
    minheap minheap = new minheap();

    minheap.insert(10);
    minheap.insert(20);
    minheap.insert(30);
    minheap.insert(40);


    System.out.println("extractedmin is "+minheap.extractMin());
  
  }

  private List<Integer> heap;

  public minheap() {
    heap = new ArrayList<>();
  }

  private int getParentIndex(int index) {
    return (index - 1) / 2;
  }

  private int getLeftChildIndex(int index) {
    return 2 * index + 1;
  }

  private int getRightChildIndex(int index) {
    return 2 * index + 2;
  }

  public void insert(int value) {
    heap.add(value);
    heapifyUp(heap.size() - 1);

  }

  private void heapifyUp(int index) {

    int parentIndex = getParentIndex(index);

    while (index > 0 && heap.get(index) < heap.get(parentIndex)) {
      swap(index, parentIndex);
      index = parentIndex;
      parentIndex = getParentIndex(index);
    }

  }

  public int extractMin(){
    
  }


  

}