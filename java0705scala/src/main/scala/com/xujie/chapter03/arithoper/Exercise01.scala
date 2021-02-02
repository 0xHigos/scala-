package com.xujie.chapter03.arithoper

object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    * 求 97天里面还有xx星期零xx天
    * */
    val days = 97
    printf("统计结果 %d 个星期零 %d 天\n", days / 7, days % 7)

    /*
    * 华氏温度转摄氏度
    * */
    val huashi = 232.5
    val sheshi = 5.0 / 9 * (huashi - 100)
    println("对应的摄氏度"+ sheshi.formatted("%.2f"))
  }


}
