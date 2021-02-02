package com.xujie.chapter01.vars

object VarDemo01 {
  def main(args: Array[String]): Unit = {
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "tom"
    var isPass: Boolean = true
    var score: Float = 70.9f
    println(s"${age} ${isPass}")
  }
}
