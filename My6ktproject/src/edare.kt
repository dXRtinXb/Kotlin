import kotlin.random.Random
abstract open class edare constructor( name:String){
    open var edareName:String = "mantaghe 10"
    open fun sendRequest ( request:String,Sender:String? ){
        println("request recieved")
        var num= Random.nextInt(1,3)
        if(num == 1){
            println("request denied")
        }else if(num !=2){
            println("request accepted")
        }
    }

    abstract fun payment( darsad:Float)




}