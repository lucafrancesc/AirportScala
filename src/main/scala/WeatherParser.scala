import scalaj.http._

class WeatherParser (city: String){
  private val key = Api.apiKey
  private val url: String = (s"http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=$key&q=$city")
  def response = Http(url).asString

}

