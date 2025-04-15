fun main() {
    var lastYearMoney = 100_000_000
    var thisYearMoney = 100_000_00
    if (lastYearMoney>thisYearMoney){
        println("You was richer last year by ${lastYearMoney-thisYearMoney}$")
    }else if (lastYearMoney<thisYearMoney){
        println("you are richer now by ${thisYearMoney-lastYearMoney}$")
    }
}