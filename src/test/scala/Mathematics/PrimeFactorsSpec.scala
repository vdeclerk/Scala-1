package Mathematics

import org.scalatest._
import flatspec._
import matchers._

class PrimeFactorsSpec extends AnyFlatSpec with should.Matchers {

  "PrimeFactorsSpec 1" should "output the correct list of all the prime factors of a number" in {
    assert(PrimeFactors.primeFactors(80) === List(2, 2, 2, 2, 5))
  }

}
