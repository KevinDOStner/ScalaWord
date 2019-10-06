package recfun

import scala.collection.mutable.ListBuffer
import common._

  /**
   * Chapter 3
   * author @noodles
   * This is a recursive function that counts how many different ways change can be made with a given a list of coins. 
   */
def countChange(money: Int, coins: List[Int]): Int = {
  if (coins.isEmpty || money < 0) return 0
  if (money == 0) return 1
  countChange(money - coins.head, coins) + countChange(money, coins.tail)
}
