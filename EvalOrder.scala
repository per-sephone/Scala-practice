object Main {
    def EvalOrder(i: Int, j: Int): Unit = {
        if(i == 1) print("left-to-right\n") 
        if(i == 2) print("right-to-left\n") 
    }
    def main(args: Array[String]): Unit = {
        var x = 1
        EvalOrder(x,{x=x+1;x})
  }
}
