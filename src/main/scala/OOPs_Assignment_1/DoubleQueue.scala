package OOPs_Assignment_1

import scala.collection.mutable.ListBuffer

class DoubleQueue(list: ListBuffer[Int]) extends Queue {
  for (i<- list.indices){
    list.update(i,list(i)*2)

  }

}
