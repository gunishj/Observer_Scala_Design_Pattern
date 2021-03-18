import  scala.collection.mutable
class WeatherStation extends IObservable {

  var observers = mutable.ListBuffer[IObserver]()
  var temperature = 23


   override def add(ob: IObserver): Unit = {
    this.observers.append(ob)
  }

   override def remove(ob: IObserver): Unit = {
    var index = observers.indexOf(ob)
    if (index != -1) {
      observers.remove(index)
    }
  }


   override def notify1(): Unit = {
    observers.foreach{ob => ob.update()}
  }

  def getTemperature():Int = {
    return this.temperature
  }

  def changeTemperature(temp :Int):Unit = {
    this.temperature = temp
    this.notify1()
  }

}
