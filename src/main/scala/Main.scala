object Main {
  def main(args: Array[String]): Unit = {
    val n = 17
    if (isPrime(n)) {
    } else {
      println(s"$n is not prime")
    }
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) {
      false
    } else {
      !(2 until n).exists(i => n % i == 0)
    }
  }
}