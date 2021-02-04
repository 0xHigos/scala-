package com.xujie.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new AA("jack")

  }

}

class BB {
  println("B~~~~")
}
class AA extends BB{
  def this(name:String){
    this //调用A的主构造器
    println("A this(name:String)")
  }
}
