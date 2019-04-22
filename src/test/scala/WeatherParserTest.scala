import org.scalatest._
import Matchers._
import net.liftweb.json.JsonAST
import net.liftweb.json.JsonDSL._
//import net.liftweb.json.Printer.{compact,pretty}

class WeatherParserTest extends FunSuite {
  test("returns a JSON object") {
    val json = new WeatherParser("london")
    print(json.response.body.contains("pressure"))

  }
}
