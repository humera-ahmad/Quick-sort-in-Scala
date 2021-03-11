package com.knoldus

import scala.language.postfixOps
import scala.collection.immutable.List

class QuickSort {
  def quickSorting(list: List[Int]): List[Int] = {
    if (list.length <= 1){
      list
    }
    else {
      val pivot = list(list.length / 2)

      List.concat(
        //recursively call quickSorting method to sort the list
        quickSorting(list filter (pivot >)), list filter (pivot ==), quickSorting(list filter (pivot <)))
    }
  }
}
