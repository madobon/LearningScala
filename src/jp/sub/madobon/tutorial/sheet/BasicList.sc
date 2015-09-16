package jp.sub.madobon.tutorial.sheet

object BasicList {
  print("----- BasicList >>>>>")                  //> ----- BasicList >>>>>
  var list = List(1, 2, 3)                        //> list  : List[Int] = List(1, 2, 3)
  var list2 = 4 :: 5 :: 6 :: Nil                  //> list2  : List[Int] = List(4, 5, 6)
  var list3 = 7 :: 8 :: 9 :: list2                //> list3  : List[Int] = List(7, 8, 9, 4, 5, 6)
  var list5 = Nil                                 //> list5  : scala.collection.immutable.Nil.type = List()

  print(">>>>> BasicList -----")
}