object Test {

  var add = (x: Int, y: Int, z: Int) => println(s"${x} + ${y} + ${z} = ${x + y + z}"): Unit
                                                  //> add  : (Int, Int, Int) => Unit = <function3>
	// 部分適用
  add(3, 2, 1)                                    //> 3 + 2 + 1 = 6
  var add1 = add(3, 2, _:Int)                     //> add1  : Int => Unit = <function1>
  var add2 = add(3, _:Int, _:Int)                 //> add2  : (Int, Int) => Unit = <function2>
  var add3 = add(3, _:Int, 1)                     //> add3  : Int => Unit = <function1>
  
  add1(1)                                         //> 3 + 2 + 1 = 6
  add2(2, 1)                                      //> 3 + 2 + 1 = 6
  add3(2)                                         //> 3 + 2 + 1 = 6
  
  // カリー化
  var addCurry = add.curried                      //> addCurry  : Int => (Int => (Int => Unit)) = <function1>
  
  addCurry(3)(2)(1)                               //> 3 + 2 + 1 = 6
	var addCurry2 = addCurry(3)(2)            //> addCurry2  : Int => Unit = <function1>
	addCurry2(1)                              //> 3 + 2 + 1 = 6
	var addCurry3 = addCurry(3)               //> addCurry3  : Int => (Int => Unit) = <function1>
	addCurry3(2)(1)                           //> 3 + 2 + 1 = 6
	
	// カリー化された関数
	val f : Int => Int => Int => Int = a => b => c => a + b + c
                                                  //> f  : Int => (Int => (Int => Int)) = <function1>
	f(3)(2)(1)                                //> res0: Int = 6
	val f2 = f(3)(2)                          //> f2  : Int => Int = <function1>
	f2(1)                                     //> res1: Int = 6
	
	// アンカリー化
	val g: (Int, Int, Int) => Int = Function.uncurried(f)
                                                  //> g  : (Int, Int, Int) => Int = <function3>
	g(3, 2, 1)                                //> res2: Int = 6
	val g2 = g(3, 2, _:Int)                   //> g2  : Int => Int = <function1>
	g2(1)                                     //> res3: Int = 6
	
	val h: ((Int, Int, Int)) => Int = Function.tupled(g)
                                                  //> h  : ((Int, Int, Int)) => Int = <function1>
}