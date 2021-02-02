package com.xujie.chapter06.method

object MethodDemo02 {
  def main(args: Array[String]): Unit = {
    val m = new MethodExce
    m.printRect()
    m.width = 2.1
    m.len = 3.4
    println("面积为：" + m.area())
  }
}

class MethodExce {

  var len = 0.0
  var width = 0.0

  def printRect(): Unit = {
    for (_ <- 0 until 10) {
      for (_ <- 0 until 8) {
        print("*")
      }
      println()
    }
  }

  //计算面积的方法
  def area() = {
    (this.len * this.width).formatted("%.2f").toDouble
  }
}
