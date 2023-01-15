/*
Nora Luna
*/

object Main {
    def main(args: Array[String]): Unit = {
       if(args.length != 1) 
       {
           println("Please enter a string argument!")
           sys.exit(1)
       }
       println("Hello, " + args(0) + "!")
    }
}
