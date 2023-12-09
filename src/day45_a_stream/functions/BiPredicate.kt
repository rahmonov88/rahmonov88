package day45_a_stream.functions

import java.util.*
import java.util.function.BiPredicate

object BiPredicateExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val contains = BiPredicate { arr: Array<Int>, num: Int ->

            //boolean result = false;
            for (each in arr) {
                if (each === num) {
                    //result = true;
                    return@BiPredicate true
                }
            }
            false
        }
        val arr = arrayOf(1, 2, 4, 5, 67, 23)
        println(contains.test(arr, 4))
        println(contains.test(arr, 43))
        println(contains.test(arr, 23))
        println()
        // anagram --- ? listen == silent
        val anagram = BiPredicate { str1: String, str2: String ->
            val arr1 = str1.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val arr2 = str2.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            Arrays.sort(arr1)
            Arrays.sort(arr2)
            arr1.contentEquals(arr2)
        }
        println(anagram.test("listen", "silent"))
        println(anagram.test("listen", "silend"))
    }
}
