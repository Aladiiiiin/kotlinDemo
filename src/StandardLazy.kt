val lazyVarargs:String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("computed")
    "hello"
}

fun main(args:Array<String>){
    println(lazyVarargs)
    println(lazyVarargs)
}