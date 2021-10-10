package Search

import org.scalatest._
import flatspec._
import matchers._

class LinearSearchSpec extends AnyFlatSpec with should.Matchers {

  "A Linear Search" should "return the index of an element in an array" in {
    val l = Vector(3,2,7,1,9,0)
    assert(LinearSearch.linearSearch(l,2) === 1)
    assert(LinearSearch.linearSearch(l,7) === 2)
  }

  it should "return -1 if the element is not present in the list" in {
    val l = Vector(3,2,7,1,9,0)
    assert(LinearSearch.linearSearch(l,17) === -1)
  }

}
