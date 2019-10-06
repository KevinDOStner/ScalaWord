 import common
 
 /**
   * This is the scala code for checks if a sentence has a balanced number of parentheses '( )' or if one was left open, which would return a false value.
   * from Chapter 2 of my Coursera Scala class, regarding Currying concepts
   * author @noodles
   */
   
  def balance(chars: List[Char]): Boolean = {
    def f(chars: List[Char], numOpens: Int): Boolean = {
      if (chars.isEmpty) {
        numOpens == 0
      } else {
        val h = chars.head
        val n =
          if (h == '(') numOpens + 1
          else if (h == ')') numOpens - 1
          else numOpens
        if (n >= 0) f(chars.tail, n)
        else false
      }
    }

    f(chars, 0)
  }
