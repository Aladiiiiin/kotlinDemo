open class Person3{
    open fun study(){
        println("I will graduate")
    }
}

class Student3 :Person3(){

    override fun study(){
        println("student3")
    }
}

fun main(args: Array<String>){
    val s = Student3()
    s.study()
}