package com.xujie.chapter05.fundetails

object Details04 {
  def main(args: Array[String]): Unit = {
    println(sayOK("marry"))
  }

  def sayOK(name: String = "jack"): String = {
    return name + "OK!"
  }
}
