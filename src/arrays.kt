fun main(args: Array<String>) {
    var myarr= arrayOf("Yegon", "Joy", true,78,67.98f, 'e')

    myarr[0]="John"
    println("My name is ${myarr[0]}")

    var myintarr= arrayOf<Int>(12,46,6574,-8)
    myintarr.sort()
    println(myintarr.sorted())

    var mystrarr: Array<String> = arrayOf("Apple", "Oranges", "Grapes")
    println("Array of Strings: ${mystrarr[0]}")

}