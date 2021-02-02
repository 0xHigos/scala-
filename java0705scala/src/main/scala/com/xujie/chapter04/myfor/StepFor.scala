package com.xujie.chapter04.myfor

object StepFor {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      println("i = "+ i)
    }

    println("---------------")
    for(i <- Range(1,10,2)) {
      println("i = " + i)
    }

    //控制步长的第二种方式-fpr 循环守卫
    println("---------------")
    for(i <- 1 to 10 if i % 2 == 1) {
      println("i = " + i)
    }
  }
}
