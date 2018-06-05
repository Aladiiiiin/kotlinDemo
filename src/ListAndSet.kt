fun main(args:Array<String>) {
//    val numbers: MutableList<Int> = mutableListOf(1,2,3)
//
//    val readOnlyView:List<Int> = numbers
//
//    println(numbers)
//
//    val Strings = hashSetOf<String>("a","b","c","c")
//    print(Strings.size)


//    print(Controller("s","r").items)

//
//    val items = listOf(1,2,3,4)
//    println(items.first()==1)
//    println(items.last()==4)
//    println(items.filter{it%2 == 0})
//
//
//    val readWriteMap = hashMapOf("foo" to 1,"bar" to 2)
//    println(readWriteMap["foo"])
//    val snapshot:Map<String,Int> = HashMap(readWriteMap)


    val i: Int = 3
    when(i){
        in 1..10 -> for(i in 5 downTo 1) {
            println("hello , $i")
        }
        else -> print(false)
    }
}







class Controller(a:String,b:String) {
    private val _items = mutableListOf<String>(a,b)
    val items: List<String> get() = _items.toList()
}

