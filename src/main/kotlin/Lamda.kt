import javax.print.DocFlavor.STRING

class Lamda {
}

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName = {argumentList : Int -> codeBody}
// val lamdaName : (Int) -> (Int) = {argumentList -> codeBody}

val square = {number : Int -> number * number}

val nameAge = {name : String, age: Int ->
    "my Name is $name I'm $age"
}

fun main() {
    println(square(12))
    println(nameAge("Joyce", 11))

    val a = "Ben Said"
    println(a.pizzaIsGreat())

    println(extendString("ariana",27))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3212
    }

    println(invokeLamda (lamda))
    println(invokeLamda { it > 3.23 })

}

// 확장함수
// ex ) String 형의 함수를 사용할 수 있다.
val pizzaIsGreat : String.() ->  String = {
    this + "Pizza is Great"
}

fun extendString(name : String, age : Int) : String {
    val introduceMySelf : String.(Int) -> String = {
        "I am $this and $it years old"
    }
    return name.introduceMySelf(age)
}

// 람다의 return
val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법
fun invokeLamda(lamda: (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}