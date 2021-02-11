package com.xujie.chapter11

object MapOperatorDemo02 {
  def main(args: Array[String]): Unit = {
    val myList = MyList()
    println(myList)
    val myList2 = myList.map(multiple)
    println("myList2:" + myList2)
  }

  def multiple(n: Int): Int = {
    2 * n
  }

}

class MyList {
  val list1 = List(3, 5, 7, 9)

  var list2 = List[Int]()

  def map(f: Int => Int): List[Int] = {
    for (item <- this.list1) {
      list2 = list2 :+ f(item)
    }
    list2
  }
}

object MyList {
  def apply(): MyList = new MyList()
}