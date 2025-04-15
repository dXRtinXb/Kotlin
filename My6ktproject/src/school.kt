class school constructor(name:String,day:Int , classes:Int) : edare(name ) {
    var name: String? = null
    var TodayClasses: Int? = null
    override var edareName = "overrided edare name"
    override fun sendRequest(request: String, Sender: String?) {
        println("overrided sen request")    }
    var darsad:Float = 0.15f
    override fun payment(darsad: Float) {
        var money:Int = 1000000
        println("this month they will recieve : ${money*darsad}")
    }


    init {
        this.name = name
        this.TodayClasses = classes
        println(" Good morning $name")
    }

    fun dayPassesBy() {
        TodayClasses.let {x->
            for (index in 1..x!!) {
                println("the $index class is started...")
                println("the $index class is finished.")
            }

        }

        println("the day is finished")
    }

    fun fireHim(name: String) {
        println("the name ->$name is fired out of class")
    }

    fun HisGrade(name: String, Grade: Int?) {
        var gradeStatus: String = ""
        gradeStatus = when (Grade) {
            null -> "absent"
            else -> "No problem"
        }
        println(gradeStatus)
    }
}

