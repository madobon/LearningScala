package jp.sub.madobon.scalable.第02章_Scalaプログラミングの第1歩.ステップ2_変数を定義する

/**
 * @author madobon
 */
class ステップ4_簡単なScalaスクリプトを書く {
  def main(args: Array[String]): Unit = {
    println("Hello, World")
    println("Hello," + "World")
    println("Hello, " + args(0))
    println(s"Hello, ${args(0)}")
  }
}