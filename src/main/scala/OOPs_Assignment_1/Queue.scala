package OOPs_Assignment_1

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

trait Queue {

  def enqueue(list: ListBuffer[Int]): Unit ={
    println("Enter the Queue elements: ")
    var element=readInt()
    list.addOne(element)
    println(element + "is Queued")
  }
  def dequeue(list: ListBuffer[Int]): Unit={
    list.remove(0)
  }


}
