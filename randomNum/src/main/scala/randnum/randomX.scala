package randnum

import math._
import util._

object randomX{
  def main(args: Array[String]): Unit ={
    for (i<- 1 to 100)
    println(rb)
  }
 /**
 Random bit generator: returns either a 0 or a 1
*/
def rb : Int = ((math.random*2).floor).toInt

  def randomX(bit:Int, shift:Int, lim: Int, accum: Int): Int ={
      if(shift > lim)
        if( accum ==7)  // this is thrown away because 7+1 is 8 but random number 0 <rn<8 ie 1 to 7 
           randomX(rb,0,lim,0) 
        else
         accum +1    // random number should start at 1, not 0
      else {
       val addon = bit << shift
//       println("bit: "+ bit + " shift: " + shift + " accum: " + (accum + addon))
        randomX(rb, shift+1, lim, accum + addon)
      }
  }
}

