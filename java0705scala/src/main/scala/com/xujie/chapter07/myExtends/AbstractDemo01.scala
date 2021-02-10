package com.xujie.chapter07.myExtends

object AbstractDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

abstract class Animal {
  var name: String
  var age: Int
  var color: String = "black"

  def cry()

}