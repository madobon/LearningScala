package jp.sub.madobon.tutorial

/**
 * @author madobon
 */
object Tutorial1 {
  def main(args: Array[String]): Unit = {
    var add = (x: Int, y: Int, z: Int) => println(s"${x} + ${y} + ${z} = ${x + y + z}"): Unit

    println(add(3, 2, 1))
    println(add(3, 2, _: Int))
    println(add(3, _: Int, _: Int))
    println(add(3, _: Int, 1))

    val calc = new Calculator
    println(calc.add(3, 2, 1))
    println(calc.brand)
    println(calc.brandef)
  }
}

class Calculator {
  /**
   * フィールド：定数
   */
  val brand: String = "HP"
  
  /**
   * 文字列”MP”を返却する関数
   */
  def brandef = "MP"
  
  /**
   * m+n+pの計算結果を返却する関数
   */
  def add(m: Int, n: Int, p: Int): Int = m + n + p
}