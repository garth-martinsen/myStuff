package randnum

import math._
import util._

object randnum {
  def main(args: Array[String]): Unit ={
    for (i<- 1 to 100)
    println(rn.nextInt(2))
  }
  def rn = new Random() //returns a zero or a one.

  def shiftAndAccum(b:Int, s:Int, accum: Int): Int =
   if(s>2) accum else shiftAndAccum( rn.nextInt, s+1, accum + b<<s)

  shiftAndAccum( rn.nextInt, 0, 0)
}
