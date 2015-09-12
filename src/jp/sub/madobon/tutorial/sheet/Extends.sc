package jp.sub.madobon.tutorial.sheet

object Extends {
  println("welcome to the scala worksheet")       //> welcome to the scala worksheet
  val prog = new Programmer()                     //> prog  : jp.sub.madobon.tutorial.sheet.Programmer = jp.sub.madobon.tutorial.s
                                                  //| heet.Programmer@7a79be86
  prog.work()                                     //> programmer work
  prog.study()                                    //> programmer study
  
  val prog2 = new Programmer2("kamata", 10)       //> Engineer2.name=kamata
                                                  //| Programmer2.name=kamata
                                                  //| Programmer2.age=10
                                                  //| prog2  : jp.sub.madobon.tutorial.sheet.Programmer2 = jp.sub.madobon.tutorial
                                                  //| .sheet.Programmer2@614c5515
  prog2.work()                                    //> programmer work
  prog2.study()                                   //> programmer study
  
  
 	printf("")
}

// 抽象クラス
abstract class Engineer {
	def work():Unit
	def study() = printf("study")
}

// 実装クラス
class Programmer extends Engineer {
	def work() = printf("programmer work")
	override def study() = printf("programmer study")
}

// 抽象クラス（コンストラクタあり）
abstract class Engineer2(name: String) {
	println("Engineer2.name="+name)
	def work():Unit
	def study() = printf("study")
}

// 実装クラス（コンストラクタあり）
class Programmer2(name: String, age: Int) extends Engineer2(name) {
	println("Programmer2.name="+name)
	println("Programmer2.age="+age)
	def work() = printf("programmer work")
	override def study() = printf("programmer study")
}