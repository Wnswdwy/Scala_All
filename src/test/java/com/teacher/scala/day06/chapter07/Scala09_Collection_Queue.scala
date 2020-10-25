package com.teacher.scala.day06.chapter07

import scala.collection.mutable

object Scala09_Collection_Queue {

    def main(args: Array[String]): Unit = {

        val que = new mutable.Queue[String]()
        // 添加元素
        // 先进先出
        que.enqueue("a", "b", "c")
        //val que1: mutable.Queue[String] = que += "d"
        //println(que eq que1)
        // 获取元素
        println(que.dequeue())
        println(que.dequeue())
        println(que.dequeue())

    }
}
