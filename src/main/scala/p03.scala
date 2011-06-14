/**
* @author Amir Moulavi
* Problem 3: Find the Kth element of a list.
*
*/

import scala.annotation.unchecked

object p03 {
        def main(args:Array[String]) {
                println(nth(2, List(1, 1, 2, 3, 5, 8)))
        }
        
        def nth[A](n:Int, list:List[A]):A = (list : @unchecked) match {
                case head :: Nil => head
                case head :: tail => if (n == 0) head else nth(n-1, tail)
        }
}