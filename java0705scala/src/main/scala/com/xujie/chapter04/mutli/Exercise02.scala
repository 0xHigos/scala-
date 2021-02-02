package com.xujie.chapter04.mutli

import scala.io.StdIn

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0 //分数
    var classScore = 0.0
    var totalScore = 0.0
    var passNum = 0
    for (i <- 1 to classNum) {
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d班级的第%d个学生的成绩\n", i, j)
        score = StdIn.readDouble()
        if (score >= 60)
          passNum += 1
        classScore += score
      }
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%.2f\n", totalScore / (stuNum * classNum))
    printf("所有班级的及格认数为为%d\n", passNum)

  }
}
