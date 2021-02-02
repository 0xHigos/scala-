package com.xujie.chapter02.datatype

object UnitNullNothindDemo {
  def main(args: Array[String]): Unit = {
    var res = sayHello()
    println("res+" + res)
    val dog: Dog = null
    println("ok")
  }

  def sayHello(): Unit = {

  }


}

class Dog {

}
