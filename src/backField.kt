import kotlin.reflect.KProperty

class Example{
    var p:String by Delegate()
}


class Delegate{
    operator fun getValue(this1:Any?,property:KProperty<*>):String{
        return "$this1, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


fun main(args:Array<String>){


    val e = Example()
    println(e.p)
    e.p = "Stupid Ma"
}