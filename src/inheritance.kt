open class mzazi{

    var dad="He likes to watch foootball"
    var mum="She likes cooking"
}
class girl:mzazi(){
    fun cooking(){
        println(mum)
    }

}
class boy:mzazi(){
    fun foootball(){
        println(dad)
    }

}

fun main(args: Array<String>) {
    val obj1=girl()
    obj1.cooking()

    val obj2=boy()
    obj2.foootball()
}