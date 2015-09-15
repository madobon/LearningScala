package jp.sub.madobon.scalable.第02章_Scalaプログラミングの第1歩.ステップ2_変数を定義する

/**
 * @author madobon
 */
class ステップ2_変数を定義する {
  def main(args: Array[String]): Unit = {
    // 変数には二種類
    var 変更可能 = "Hello, World!"
    val 変更不可能 = "Hello, World!"

    変更可能 = "変更できるよ"

    // コンパイルエラーが発生する
    // 変更不可能 = "変更できないよ"

    // 右辺で型が判断出来る場合は型推論されるため、型の指定が不要
    var 型指定あり: String = "型を指定しています。"
    var 型指定なし = "型を指定しています。"

    // Javaとは違って、型指定の位置が前後逆
    // [Java] の場合
    // String value = "hogehoge"
    // [Scala] の場合
    // var value: String = "hogehoge"

  }
}