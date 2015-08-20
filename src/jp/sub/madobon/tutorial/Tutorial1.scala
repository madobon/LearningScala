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

  }
}