package com.xujie.chapter05.fundetails

object Details01 {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    val tiger2 = test(10, tiger)
    println(tiger2.name)
  }

  def test(n1: Int, tiger: Tiger): Tiger = {
    println("n1 = " + n1)
    tiger.name = "jack"
    tiger
  }
}

class Tiger {
  var name = ""
}
