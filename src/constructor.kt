class safaristudents(val jina:String, val miaka:Int, val jinsia:String){

}

fun main(args: Array<String>) {
    val myobj=safaristudents("Yegon", 12, "Male")
    val myobj2=safaristudents("Joy", 18, "Female")
    println("My name is ${myobj.jina}")
    println("My age is ${myobj.miaka}")
    println("My gender is ${myobj.jinsia}")

    println("My girlfriend is ${myobj2.jina}")
    println("She is ${myobj2.miaka} years old")
    println("She is ${myobj2.jinsia}")

}