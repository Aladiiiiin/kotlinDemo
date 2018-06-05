open class Person(var name:String, var age : Int){

}

class Student(name : String, age : Int, var no : String, var score : Int) : Person(name,age){

}

fun main(args : Array<String>){
    val s = Student("Runoob",18,"S123456",89)
    println("name is ${s.name}")
    println("age is ${s.age}");
    println("score is ${s.score}")
}

