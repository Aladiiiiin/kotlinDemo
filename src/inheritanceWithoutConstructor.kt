
class Student2 : Person {

    constructor(name:String,age:Int,no:String,score:Int):super(name, age){
        println("name is ${name}")
        println("age is ${age}");
        println("score is ${score}")
    }
}

fun main(args: Array<String>){
    var s = Student2("Runoob",18,"S12345",89)
}