
fun main(args:Array<String>){
    println(lock("param1","param2", ::getResult))
}

fun getResult(str1:String,str2:String):String = "result is {$str1,$str2}"

fun lock(p1: String, p2: String, method: (str1:String,str2:String) -> String): String{
    return method(p1,p2)
}