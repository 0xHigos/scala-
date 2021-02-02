package com.xujie.chapter04.ifelse

object Exercise02 {
  def main(args: Array[String]): Unit = {
    /*
    * 求 ax^2 + bx + c = 0 方程的根\
    * b^2 - 4ac > 0 有两个解
    * b^2 - 4ac = 0 有一个解
    * b^2 - 4ac < 0 无解
    * */
    val a = 3
    val b = 100
    val c = 6
    val m = b * b - 4 * a * c
    var x1 = 0.0
    var x2 = 0.0
    if (m > 0) {
      x1 = (-b + math.sqrt(m)) / 2 * a
      x2 = (b + math.sqrt(m)) / 2 * a
      println("有两个解：x1 = " + x1.formatted("%.2f") +
        ",x2 = " + x2.formatted("%.2f"))
    } else if (m == 0) {
      x1 = (b + math.sqrt(m)) / 2 * a;
      x2 = x1
      println("有一个解：x1 = " + x1)
    } else {
      println("有一个解")
    }
  }
}
