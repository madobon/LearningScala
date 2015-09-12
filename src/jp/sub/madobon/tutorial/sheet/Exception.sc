package jp.sub.madobon.tutorial.sheet

object Exception {
	// 定義可能な場合 Some に
	println(mean(Seq(1.0)))                   //> Some(1.0)
	// 未定義の場合 None に
	println(mean(Seq()))                      //> None
	
	def mean(xs: Seq[Double]): Option[Double] =
		if (xs.isEmpty) None
		else Some(xs.sum / xs.length)     //> mean: (xs: Seq[Double])jp.sub.madobon.tutorial.sheet.Option[Double]
}

sealed trait Option[+A]
// 定義可能な場合 Some に
case class Some[+A](get: A) extends Option[A]
// 未定義の場合 None に
case object None extends Option[Nothing]