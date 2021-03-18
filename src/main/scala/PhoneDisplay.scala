class PhoneDisplay(station: WeatherStation) extends IObserver {
//  var station1 :WeatherStation
//  this.station1 = station
  override def update(): Int ={
    println("your object instance has been triggered which has a temprature of ", station.getTemperature())
    return station.getTemperature()
    //we can push the termperature directly from observable class or  we can notify by calling the update function and in this function we can modify it as per our need.
  }

}
