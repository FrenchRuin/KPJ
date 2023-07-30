

fun main(){
    nullCheck()

}

// 1. 함수
// UNIT  >> VOID
fun helloWorld(){
    println("Hello World!")
}

// 변수명 : 타입 .. : 리턴
fun add(a: Int, b: Int): Int {
    return a + b
}

// 2. val vs var
// val = value // 변경불가
// var = variable // 변수로 변경가능
fun hi() {
    val a : Int = 10
    var b : Int = 9

    b = 100

    // 형 작성하지 않아도 괜찮다.
    val c = 100
    var d = 100
    var name = "Ben"
}

fun dic() {
    // 3. String Template
    val name = "Ben"
    val lastName = "Lee"
    println("my name is ${name + lastName}")
    println("is this True? ${1==0}")

}

//4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }else{
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if(a>b) a else b

fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2, 3")
        else -> println("I don't know")
    }

    val b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println(" b : $b")

    when (score) {
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not Bad")
        else -> println("Okay")
    }
}

// Expression vs Statement
// Kotlin 모든 함수는 Expression

// 5. Array and List
// Array
// List 1. List 2.MutableList
fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    array[0] = 3

    val arrayList = arrayListOf<Int>()

    arrayList.add(10)
    arrayList.add(20)
}

// 6. for / While
fun forAndWhile() {

    val students  = arrayListOf("F","D","E","B")

    for (name in students) {
        println("${name}")
    }

    for ((index: Int, name : String) in students.withIndex()) {
        println("${index +1} 번째 학생 : $name")
    }

    // 10 downTo 1 , 1 .. 100 , 1 until 100
    var sum : Int = 0
    for (i in 10 downTo 1) {
        sum += i
    }

    println(sum)

    var idx = 0
    while (idx < 10) {
        println("current Idx : $idx")
        idx++
    }
}

// 7. Nullable / NonNull
fun nullCheck() {
    // NPE : Null Pointer Exception
    val name : String = "Ben"

    var nullName : String? = null

    var nameInUpperCase :String = name.uppercase()

    // null 이 아니면 uppercase , null 이면 null return
    var nullNameInUpperCase = nullName?.uppercase()

    // ? :
    val lastName: String? = "Hong"
    val fullName = name + " " + (lastName ?: "No LastName")
    var mLastName = lastName ?: throw IllegalArgumentException("No Last Name")
    println(fullName)
}

// 정말 널일 수가 없다 . !!
fun ignoreNulls(str: String?) {
    val mNotNull: String = str!!
    val upper = mNotNull.uppercase()

    // Null 이 아니면 let 실행
    val email: String? = "qpsh023@naver.com"
    email?.let {
        println(email)
    }
}
