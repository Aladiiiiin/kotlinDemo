class KtStatic{

    var number1 = 10

    fun getId1():Int{
        return 11
    }

    //伴生对象
    companion object {
        var number2 = 20

        fun getId2():Int{
            return 21
        }
    }
}

fun main(args:Array<String>){
    var number2=KtStatic.number2

    var id2=KtStatic.getId2()
}