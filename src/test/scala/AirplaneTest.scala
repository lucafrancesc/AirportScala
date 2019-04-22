import org.scalatest._
import Matchers._

class AirplaneTest extends FunSuite{
  test("it creates a plane object") {
    val plane = new Airplane()
    plane.isInstanceOf[Airplane] shouldBe true
  }

  test("when the plane is created its status should not be flying") {
    val plane = new Airplane()
    plane.flying shouldBe false
  }
}