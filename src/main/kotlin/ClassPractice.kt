class ClassPractice {

}


open class Human(val name : String = "Anonymous") {
    // 클래스를 생성할 때 하고싶은 행동 init
    init {
        println("Hello bro")
    }

    fun eatingCake() {
        println("This is so Yummmmy ~~~~")
    }

    open fun singASong(){
        println("LaLaLaLaLaLaLa ~~ ")
    }
}

// abstract 개념은 open
class Korean : Human() {

    override fun singASong() {
        super.singASong()
        println("Sing A Song")
    }

}


fun main() {
    val korean  = Korean()
    korean.singASong()
    println(korean.name)
}