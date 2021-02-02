package com.xujie.chapter02.datatype

object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    //当我们输出一个char类型时，它会输出该数字对应的字符(码值表 unicode) //unicode 码值表包括ascii
    println("char1=" + char1)

    //char 可以当作数字进行运算
    var char2: Char = 'a'
    var num = 10 + char2
    println("num:" + num)


    //当把一个计算的结果赋值给一个变量，则编译器会进行类型转换及判断(既会看范围+类型）
    //当把一个字面量赋值一个变量，则编译器会进行范围的盘定
    /*
    var c2:Char = 'a'+1
    var c2:Char = 97 + 1
    var c2:Char = 9999
    */
    var c2:Char = 98
    var c3:Char = 9999
  }
}
