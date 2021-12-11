package OOPs_Assignment_1

import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]): Unit = {


    val list = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Queue is:  ")
    for (i <- list.indices)
      print(list(i) + " ")

    var doubleQueue = new DoubleQueue(list)
    println("\nDoubleQueue is  ")
    for (i <- list.indices)
      print((list(i) + " "))

    var squareQueue = new SquareQueue(list)
    println("\nSquareQueue is")
    for (i <- list.indices)
      print(list(i) + " ")

    squareQueue.dequeue(list)
    println("\n list after dequeue first element")
    for(i<- list.indices) {

      print((list(i) + " "))
    }


  }
}
