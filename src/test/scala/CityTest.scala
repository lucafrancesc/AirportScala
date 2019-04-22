import org.scalatest._
import Matchers._

class CityTest extends FunSuite{

  test("crates an instance of City") {
    val london = new City("London")
    london.isInstanceOf[City] shouldBe true
  }

}
