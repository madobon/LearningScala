package jp.sub.madobon.tutorial.sheet

object Exception2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}

trait Option[+A] {
	// Option が None でない場合は f を適用。
  def map[B](f: A => B): Option[B]
  // Option が None でない場合は、失敗する可能性がある f を適用。
  def flatMap[B](f: A => Option[B]): Option[B]
  // B >:A は、パラメータBの型がAのスーパークラスでなければならないことを示す。
  def getOrElse[B>:A](default: => B): B
  // 必要でない限り、ob を評価しない
  def orElse[B>:A](ob: => Option[B]): Option[B]
  // 値が f の条件を満たさない場合は、 Some を None に変換。
  def filter(f: A => Boolean): Option[A]
}