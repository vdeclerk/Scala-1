package Mathematics

import org.scalatest._
import flatspec._
import matchers._

class FindMinSpec extends AnyFlatSpec with should.Matchers {

  "FindMinSpec 1" should "output the correct Integer as a result from the list of elements" in {
    assert(FindMin.findMin(List(-1000, -1, 999, 72, 65, -56, -767)) === -1000)
  }

  "FindMinSpec 2" should "output the correct Integer as a result from the list of elements" in {
    assert(FindMin.findMin(List(121, 221, 3, 4112)) === 3)
  }

}
