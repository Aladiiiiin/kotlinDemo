package enumDemo

import enumDemo.TrangloState.FAIL

fun main(args:Array<String>){
    var s: Stupid = Stupid()
    changeS(s);
    print(s.a)

}

fun changeS(s:Stupid?):Stupid
{
    s!!.a = "dsadsadsadsadsa"
    return s
}


class Stupid {
    var a:String? = null
}