package jp.sub.madobon.tutorial.sheet

object Anonymous {
  print("----- Anonymous >>>>>")                  //> ----- Anonymous >>>>>
  
  // 無名関数（Anonymous Functions）
  val addOne = (x: Int) => x + 1                  //> addOne  : Int => Int = <function1>
  addOne(2)                                       //> res0: Int = 3
 
 	print(">>>>> Anonymous -----")
}