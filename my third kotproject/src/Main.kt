fun main() {
    var dayNumber = 0
    var day:String =""

    day = when(dayNumber){
        0-> "sunday"
        1->"monday"
        2->"tuesday"
        3->"wednesday"
        4->"thursday"
        5->"friday"
        6->"saturday"


        else -> {
            "error"
        }


    }
    println("today is ${day}")

}

