class add{
//    data member

    var num=7
    var num2=5

//    member function
    fun add():Int{
        return num+num2
    }


}

fun main(args: Array<String>) {
//    instance of my object

    val obj=add()
    println(obj.add())
}