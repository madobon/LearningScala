package jp.sub.madobon.scalable.第02章_Scalaプログラミングの第1歩.ステップ2_変数を定義する

/**
 * @author madobon
 */
class ステップ3_関数を定義する {
  def main(args: Array[String]): Unit = {
    max_基本形(3, 5)
    max_省略形(3, 5)
    greet("Hello, World!")
  }

  /**
   * <pre>
   * def 関数名(引数1: 引数1の型, 引数2: 引数2の型): 戻り値の型 = {
   * }
   * </pre>
   */
  def max_基本形(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  /**
   * <pre>
   * def 関数名(引数1: 引数1の型, 引数2: 引数2の型) = 戻り値 
   * </pre>
   */
  def max_省略形(x: Int, y: Int) = if (x > y) x else y
  
  /**
   * Javaのvoidに該当するのが、ScalaのUnit
   */
  def greet(msg: String) = println(msg)
}