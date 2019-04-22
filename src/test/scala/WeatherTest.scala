import org.scalatest._
import Matchers._

class WeatherTest extends FunSuite {

  test("crates an instance of Weather and city") {
    val london = new City("london")
    val weather = new Weather(london)
    weather.isInstanceOf[Weather] shouldBe true
  }

  test("'checks' the weather in London") {
    val london = new City("london")
    val weather = new Weather(london)
    weather.condition shouldBe "windy"
  }
}
