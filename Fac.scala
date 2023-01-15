/*
Nora Luna
*/

object Fac{
    //iterative
    def fac(n:Int): Int = {
        var sum = 1
        var newN = n
        while(newN > 0)
        {
            sum = sum * newN
            newN = newN-1
        }
        return sum
    }

    //recursive
    def facI(n:Int): Int = {
        if(n == 0) return 1
        val newN = n
        return newN * facI(n-1)
    } 

    def main(args: Array[String]): Unit = {
        assert(args.length > 0)
        val n = args(0).toInt
        assert(n > 0)
        printf("fac(%d) = %d\n", n, fac(n))
        printf("facI(%d) = %d\n", n, facI(n))
    }
}
