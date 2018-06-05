fun main(args:Array<String>){
    val x = "tppp"
    if(hasPrefix(x)){
        println("yes")
    }else
        println("no")
}

fun hasPrefix(x: Any):Boolean=when(x){
    is String -> x.startsWith("p")
    else ->false;
}