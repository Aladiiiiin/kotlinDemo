data class Point(val x: Int, val y: Int){
    operator fun plus(p: Point):Point{
        return Point(x+p.x,y+p.y)
    }

    operator  fun minus(p:Point):Point{
        return Point(x-p.x,y-p.y)
    }

    operator fun times(p: Point): Point {
        return Point(x * p.x, y * p.y)
    }

    operator fun div(p: Point): Point {
        return Point(x / p.x, y / p.y)
    }

    operator fun rem(p: Point): Point {
        return Point(x % p.x, y % p.y)
    }
}

fun main(args: Array<String>){
    val p1 = Point(1,10);
    val p2 = Point(2,20)

    print(p1+p2)//p1.plus(p1)


}