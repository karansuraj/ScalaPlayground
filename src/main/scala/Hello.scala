/*class Hello {
  println("Hello, World!")
}*/
object Hello extends App{
  println("Hello, WERLD!")
  println(square(2))
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
  def square(x: Int) = x * x

}


