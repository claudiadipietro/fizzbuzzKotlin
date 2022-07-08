class fizzbuzz() {

    fun isFizz (number: Int): Boolean {
        return ((number % 3) == 0)
    }

    fun isBuzz (number: Int): Boolean {
        return (number % 5) == 0
    }

    fun isFizzbuzz (number: Int): Boolean{
        return (isFizz(number) && isBuzz(number))
    }

    fun getFizzBuzz(number: Int): Any{
        if (isFizzbuzz(number)){
            return "fizzbuzz"
        } else if (isBuzz(number)) {
            return "buzz"
        } else if (isFizz(number)){
            return "fizz"
        }
        return ""
    }

}