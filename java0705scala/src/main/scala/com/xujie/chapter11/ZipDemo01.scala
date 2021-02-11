package com.xujie.chapter11

object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2)
    val list2 = List(4,5,6)
    val list3 = list1.zip(list2)
    println("list3 = " + list3)
  }
}
