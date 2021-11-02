package com.knoldus.ListLength

class ListTailRecursion {

  def RecursionLength (list: List[Int], accu: Int = 0): Int ={
    if (list == List()) accu
    else
      RecursionLength(list.tail, accu + 1)
  }
}