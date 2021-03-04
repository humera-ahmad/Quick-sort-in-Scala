package com.knoldus

import scala.language.postfixOps
import scala.collection.immutable.List

class QuickSort {
  def QuickSorting(list: List[Int]): List[Int] = {
    //if size of array is less then or equals 1 then return it as it is
    if (list.length <= 1) list

    else {
      // find the pivot element
      val pivot = list(list.length / 2)

      List.concat(
        //recursively call QuickSorting method to sort the list
        QuickSorting(list filter (pivot >)), list filter (pivot ==), QuickSorting(list filter (pivot <)))
    }
  }
}
