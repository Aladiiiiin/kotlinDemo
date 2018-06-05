//fun main(args: Array<String>){
//    val items = listOf("apple","banana","kiwi")
//    for(item in items){
//        println(item);
//    }
//
//    for (index in items.indices){
//            println("item at $index is ${items[index]}")
//    }
//}

fun main(args: Array<String>){
    println("---While usage---")
    var x = 5
    while(x>0){
        println(x--)
    }
    print("--do...while usage--")
    var y = 5
    do{
        println(y--)
    }while(y>0)
}