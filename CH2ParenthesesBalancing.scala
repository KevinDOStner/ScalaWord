 import common
 
 /**
   * This is the scala code for checks if a sentence has a balanced number of parentheses '( )' or if one was left open, which would return a false value.
   * from Chapter 2 of my Coursera Scala class, regarding Currying concepts
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
