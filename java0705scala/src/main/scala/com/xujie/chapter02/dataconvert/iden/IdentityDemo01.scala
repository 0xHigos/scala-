package com.xujie.chapter02.dataconvert.iden

object IdentityDemo01 {
  def main(args: Array[String]): Unit = {
    //首字符为操作符(比如 + _ * / ) ，后续也需要跟进操作符，至少一个
    val ++ = "hello,world"
    println(++)

    val -+ = 90
    println(-+)

    val `true` ="hello,scala"
    println(`true`)


  }
}
