package randnum

@RunWith(classOf[JUnitRunner])
class randnumSuite extends FunSuite {
  trait TestArrays {
    val t1=Array[Int](0,0,0,0,0,0,0)
    val pop = 1000000
    val perNum = pop/8
  }

  test("1+1=2"){
    new TestArrays {
      assert(1+1 == 2, "One plus One should always be 2")
    }
  }


  
}
