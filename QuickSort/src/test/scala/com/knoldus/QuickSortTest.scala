package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QuickSortTest extends AnyFlatSpec {
  val quickSort = new QuickSort

  "QuickSort" should "return correct result" in {
    val result = quickSort.quickSorting(List(3,4,9,2,1))
    assertResult(List(1,2,3,4,9))(result)
  }

  it should "return empty list" in {
    val result = quickSort.quickSorting(List())
    assertResult(List())(result)
  }
}
