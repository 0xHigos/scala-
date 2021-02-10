package com.xujie.chapter08

object Accompanydemo {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.set)
    ScalaPerson.sayHi()
  }
}

class ScalaPerson {
  var name: String = _
}

object ScalaPerson {
  var set: Boolean = true
  def sayHi():Unit={
    println("sayHi")
  }
}
