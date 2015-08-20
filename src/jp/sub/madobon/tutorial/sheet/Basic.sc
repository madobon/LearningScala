package jp.sub.madobon.tutorial.sheet

object Basic {
  def adder(m: Int, n: Int) = m + n               //> adder: (m: Int, n: Int)Int
  def multiply(m: Int)(n: Int): Int = m * n       //> multiply: (m: Int)(n: Int)Int

  // 無名関数（Anonymous Functions）
  val addOne = (x: Int) => x + 1                  //> addOne  : Int => Int = <function1>
  addOne(2)                                       //> res0: Int = 3

  // 部分適用（Partial application）
  // 複数の引数を取る関数に対して、一部の引数の値を固定化した関数を返すこと。
  val addOne2 = adder(1, _: Int)                  //> addOne2  : Int => Int = <function1>
  addOne2(2)                                      //> res1: Int = 3

  // カリー化（Curried functions）
  // 複数の引数を取る関数に対して、1つの引数を取る関数のチェーンに変換すること。
  multiply(2)(3)                                  //> res2: Int = 6
	// 引数にパラメータの数だけリストを用意する
	// _ でカリー化された関数にアクセスする
	// 一度 _ したら再度 _ は不要
  val timesTwo = multiply(2) _                    //> timesTwo  : Int => Int = <function1>
  val curriedAdd = (adder _).curried              //> curriedAdd  : Int => (Int => Int) = <function1>
  val addTwo = curriedAdd(2)                      //> addTwo  : Int => Int = <function1>
  addTwo(4)                                       //> res3: Int = 6
}