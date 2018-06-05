class Runoob (name:String){
    var url:String="www.baidu.com"
    var country:String="CN"
    var siteName = name

    init{
        println("初始化网站名：${name}")
    }

    //次构造函数
    constructor(name:String,alexa:Int):this(name){
        println("Alexa排名 $alexa")
    }

    fun pringTest(){
        print("我是pringTest")
    }
}

fun main(args: Array<String>){
    val runoob = Runoob("myRunoob",10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.pringTest()
}