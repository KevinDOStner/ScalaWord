import scala.collection.mutable.ListBuffer
import common._

/**
* This is a solution to Chapter 1 Assignment from Pascals Triangle that uses recursion in Scala.
* author @noodles
*/
def pascal(c: Int, r: Int): Int = (c,r) match {
    case (c,r) => 
      if(c==0 || c == r) return 1
      else pascal(c-1,r-1) + pascal(c,r-1)
  }

 
