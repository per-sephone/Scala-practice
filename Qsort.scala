/*
Nora Luna
*/

import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Qsort {
    val MINSIZE = 10 //switch to bubble sort
    var a: Array[Int] = _
    
    def createArray(N: Int) = {
        var buff = ArrayBuffer[Int]()
        val rand = new scala.util.Random
        
        for (_ <- 0 to N-1){
            buff += rand.nextInt(10) //FIX ME
        }
        a = buff.toArray
    }
    
    def printArray(msg: String) = {
        print(msg)
        for(i <- 0 to a.length-1) print(a(i) + " ")
        println()
    }

    def swap(posX: Int, posY: Int) = {
        val temp = a(posX)
        a(posX) = a(posY)
        a(posY) = temp
    }

    def bubbleSort(low: Int, high: Int) = {
        for(j <- low+1 to high; i <- low+1 to high)
        {
            if(a(i-1) > a(i)) {
              swap(i-1, i)
            }
        }
    }

    def partition(low: Int, high: Int): Int = {
        val pivot = a(high)
        var i = low-1
        for(j <- low to high-1){
            if(a(j) <= pivot){
                i= i+1
                swap(i, j)
            }
        }
        swap(i+1, high)
        return i+1
    }

    def quickSort(low: Int, high: Int): Unit = {
        if(low < high) {
            if(high-low < MINSIZE) bubbleSort(low,high)
            else {
                val parti = partition(low, high)
                quickSort(low, parti-1)
                quickSort(parti+1, high)
            }

        }

    }

    def verifyArray() = {
        for(i <- 0 to a.length-2){
            if(a(i) > a(i+1)) {
                print("FAILED: a(" + i + ")=" + a(i) + ", a(" + (i+1) +")=" + a(i+1))
                println()
                sys.exit(1)
            }
        }
        print("Results verified!\n")

    }

    def main(argv: Array[String]) = {
       assert(argv.length > 0)
       val N = argv(0).toInt
       assert(N > 0)

       createArray(N)
       printArray("Initial array: ")

       //test methods
        //bubbleSort(0, N-1)
        //printArray("After Bubble: ") 

       quickSort(0, N-1)
       printArray("After quickSort: ")
       verifyArray
   }
}
