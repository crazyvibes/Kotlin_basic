package `in`.crazyvibes.kotlin_basic

class CircleCalc {
    private val pi = 3.14;

    fun getCircumFerence(inputRadius:Double):Double{

        return 2*pi*inputRadius;
    }

    fun getArea(inputRadius: Double):Double{

        return pi*inputRadius*inputRadius;
    }

}