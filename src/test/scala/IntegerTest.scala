import org.scalatest.funsuite.AnyFunSuite

class IntegerTest extends AnyFunSuite {
  val zero = Zero

  test("Test the zero object"){
    assert(zero.isZero == true)
    assert(zero.successor.isZero == false)
    assert(zero.+(zero).isZero == true)
    assert(zero.-(zero).isZero == true)
  }

  val one = new Succ(zero)
  test("test the one"){
    assert(one.isZero == false)
    assert(one.successor.isZero==false)
    assert(one.predecessor.isZero == true)
    assert(one.+(one).isZero==false)
    assert(one.-(one).isZero==true)
  }

}
