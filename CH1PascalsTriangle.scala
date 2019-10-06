import scala.collection.mutable.ListBuffer
import common._

/**
* This is a solution to Chapter 1 Assignment from Pascals Triangle that uses recursion in Scala.
* author @noodles
*/
 def balance(chars: List[Char]): Boolean = {
    def f(chars: List[Char], num: Int): Boolean = {
      (chars,num) match {
        case (Nil,num) => return num == 0
        case (c :: tail,num) =>
          if(num < 0) return false
          if(c == '(') return f(tail,num+1)
          if(c == ')') return f(tail,num-1)
          else return f(tail,num)
      }
    }
    f(chars,0)
  }

 
