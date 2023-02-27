//converting iterative to recursive and vice versa

object Main{

    def g(n:Int): Int = { //recursive
        if (n <= 3) 1
        else g(n-1) + g(n-2) + g(n-3)
    }

    def f(n:Int): Int = { //tail-recusive
        def helper(n:Int, a:Int, b:Int, c:Int):Int = {
            if(n<=3) a
            else helper(n-1,a+b+c,a,b)
        }
        helper(n,1,1,1)
    }
    def facT(n:Int): Int = {
        def helper(k:Int, a:Int): Int = {
            if (k <= 1) a
            else helper(k-1, k*a)
        }
        helper(n,1)
    }

    def facS(n:Int):Int = {
        var k=n
        var a=1
        while(k > 1) {
            k=k-1
            a+=a*k
        }
        a
    }
    
    def main(args: Array[String]): Unit = {
        val n = 10 
        //println("non-tail recursive form: " + g(n))
        //println("tail recursive form: " + f(n))
        println("tail-recurisve version: " + facT(n))
        println("iterative version: " + facS(n))
    }
}
