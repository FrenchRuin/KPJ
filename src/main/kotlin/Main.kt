

fun main(){

    // 3. String Template
    val name = "Ben"
    println("my name is $name")

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
