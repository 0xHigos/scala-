package com.xujie.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val work = new Work("smith")
    work.name

    val work2 = new Work2("smith2")
    work2.inName
    println("hello")
  }
}
class Work(inName:String){
  var name = inName
}

class Work2(val inName:String){
  var name = inName
}
