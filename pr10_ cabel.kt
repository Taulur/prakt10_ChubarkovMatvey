
   class Cabel (type : String, cablecores : Int, diametr : Double, quality : Double) : CabelAbstract (type,cablecores,diametr,quality) {

    override fun Input() {
        try {
            println("Введите тип кабеля")
            type = readln()
            do {
                println("Введите количество оплеток кабеля")
                cablecores = readln()!!.toInt()
            } while (cablecores <= 0)
            do {
                println("Введите диаметр кабеля")
                diametr = readln()!!.toDouble()
            } while (diametr <= 0)
            quality = diametr / cablecores
        } catch (e: Exception) {
            println("Данные введены неверно")
        }
    }
    override fun Output()
    {
        println("Тип кабеля - ${type}")
        println("Количество оплеток кабеля - ${cablecores} шт.")
        println("Диаметр кабеля - ${diametr}")
        println("Качество кабеля - ${quality}")
    }
}