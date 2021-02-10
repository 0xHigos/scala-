package com.xujie.chapter08

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val unit = List(1,2,5)
    println(unit)
    val pig =new Pig("小花")

    val pig2 = Pig("小黑猪")
    val pig3 = Pig()

    println("pigj2.name=" + pig2.name)
    println("pig3.name=" + pig3.name)
  }
}

class Pig(pName:String){
  var name:String = pName
}
object Pig{
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪猪")
}
