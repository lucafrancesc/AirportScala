import scalaj.http._

class WeatherParser (city: String){
  private val api = new Api
  private val key = api.apiKey
  private val url: String = (s"http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=$key&q=$city")
  def response = Http(url).asString

}

