import scala.collection.immutable.TreeSet

def findPrimesUpTo(limit:Int, cur:Int, primes:TreeSet[Int]):TreeSet[Int] = {
     if(cur > limit ) primes else{ 
      var no:Int =0;
      primes.foreach((elem: Int) => cur % elem match{ case 0 => no += 1;case _ => no = no;})
      if(no == 0) 
         findPrimesUpTo(limit, cur+2, primes + cur); 
      else 
         findPrimesUpTo(limit, cur+2, primes);
      }
}
