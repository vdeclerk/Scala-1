package Mathematics

import org.scalatest._
import flatspec._
import matchers._

class BinaryExponentiationSpec extends AnyFlatSpec with should.Matchers {

  it should "output the correct Integer as a result for base raised to the power " in {
    assert(BinaryExponentiation.binaryExponentiation(2, 3) === 8)
  }

}
