trait IObservable {
  def add(ob: IObserver)
  def remove(ob: IObserver)
  def notify1()
}
