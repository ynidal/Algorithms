import scala.io.Source
import scala.collection.mutable.ListBuffer

object Reader {

    var _lines:ListBuffer[String] = ListBuffer()
    def readFile(path:String):Unit = {
        print(s"Reader starts reading file in $path")
        
        for (_line <- Source.fromFile(path).getLines)
            _lines.append(_line)

        print(s"\ntotal Lines = ${_lines.length}")
    }

    def printContent : Unit = {
        println("\n\nPrinting content.... ")
        _lines.foreach(println)
    } 
}

def main(args: Array[String]): Unit = {
    
    if (args.length > 0)
        var reader = Reader
        for (arg <- args)
            reader.readFile(arg)
            reader.printContent
    else
        print("Not arguments were given !!!")
}
