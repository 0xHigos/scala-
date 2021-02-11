package com.xujie.chapter11

object MapOperateDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(3,5,7)
    var list2 = List[Int]()
    for(item <- list){
      list2 = list2 :+ item * 2;
    }
    println("list2 = " + list2)
  }
}
