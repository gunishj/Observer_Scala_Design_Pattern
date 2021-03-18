object mainObject {
  def main(args: Array[String]): Unit = {

    println("Hello welcome to push pull architecture of Observer implemented over weather station")

    var IMD_Delhi = new WeatherStation

    var Note7s = new PhoneDisplay(IMD_Delhi)
    var Redmi7a = new PhoneDisplay(IMD_Delhi)

    IMD_Delhi.add(Note7s)
    IMD_Delhi.add(Redmi7a)

    IMD_Delhi.changeTemperature(25)
    IMD_Delhi.remove(Note7s)
    IMD_Delhi.changeTemperature(31)

    println(IMD_Delhi.getTemperature())

  }
}
