package com.xujie.chapter02.dataconvert

object String2basic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    //基本数据类型转String
    val s1 = d1 + ""

    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble

    println("ok~~")

    /*val s3 ="hello"
    println(s3.toInt)*/

    val s4 ="12.5"
    println(s4.toInt)
  }
}
