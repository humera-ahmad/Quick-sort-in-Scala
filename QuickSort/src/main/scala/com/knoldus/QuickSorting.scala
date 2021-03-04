package com.knoldus

import scala.collection.immutable.List

object QuickSorting {

  def main(args: Array[String]): Unit = {
    //creating object
    val quick = new QuickSort

    println("Enter 5 numbers to sort")

    try {
      //taking input from user
      val userInput = List.fill(5) {
        scala.io.StdIn.readInt()
      }
      //printing formatted output
      println(quick.QuickSorting(userInput).mkString("(", ", ", ")"))
    }
    catch {
          //if input type is string then handle the exception
          case e: NumberFormatException => println(s"Kindly enter numbers only as it's causing $e")
    }
  }
}
