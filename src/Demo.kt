fun main(args: Array<String>) {
    val age:Int = 10

    if (age > 18) {
        println("Adult")
    } else {
        println("Minor")
    }
	
    var result = if (age > 18) {
        "Adult"
    } else {
        "Minor"
    }
    println(result)
	
	result = if (age > 19) {
        "Adult"
    } else if ( age > 12 && age  < 20 ){
        "Teen"
    } else {
        "Minor"
    }
    print("The value of result : ")
    println(result)
}