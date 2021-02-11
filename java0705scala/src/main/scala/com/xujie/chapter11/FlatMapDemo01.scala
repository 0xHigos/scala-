package com.xujie.chapter11

object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.flatMap(upper)
    println("names2 :" + names2)
  }

  def upper(s: String): String = {
    s.toUpperCase
  }
}