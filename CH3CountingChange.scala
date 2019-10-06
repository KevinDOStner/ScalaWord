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


/* ### Deprecated code:

def countChange(amount: Int): Int = {
  def firstDenomination(kindsOfCoins: Int): Int = {
    kindsOfCoins match {
      case 1 => 1
      case 2 => 5
      case 3 => 10
      case 4 => 25
      case 5 => 50
    }
  }

  def cc(amount: Int, kindOfCoins: Int): Int = {
    if (amount == 0) 1
    else if (amount < 0 || kindOfCoins == 0) 0
    else cc(amount, kindOfCoins - 1) + cc(amount - firstDenomination(kindOfCoins), kindOfCoins)
  }

  cc(amount, 5)
}
countChange(100) //should be 292
*/
