package Mathematics

import org.scalatest._
import flatspec._
import matchers._

class AbsMaxSpec extends AnyFlatSpec with should.Matchers {

  "Abs max spec 1" should "output the correct Integer as a result from the list of elements" in {
    assert(AbsMax.absMax(List(-1000, -1, 999, 72, 65, -56, -767)) === 1000)
  }

  "Aba max spec 2" should "output the correct Integer as a result from the list of elements" in {
    assert(AbsMax.absMax(List(121, 221, 3, 4112)) === 4112)
  }

}
