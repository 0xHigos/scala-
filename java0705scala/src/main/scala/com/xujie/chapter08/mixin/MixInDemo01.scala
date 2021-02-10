package com.xujie.chapter08.mixin

object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    val oralceDB = new OralceDB with Operate3
    oralceDB.insert(100)
    val mysql = new MYSQL3  with Operate3
    mysql.insert(200)


    /*

     */

    val MYSQL3_ = new MYSQL3_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }
    MYSQL3_.insert(300)
    MYSQL3_.say()
  }
}

trait  Operate3{
  def insert(id:Int):Unit = {
    println("插入数据 = " + id)
  }

}

class OralceDB{

}
abstract class MYSQL3{

}

abstract class MYSQL3_{
  def say()
}