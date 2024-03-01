class Opletka(type : String, cablecores : Int, diametr : Double, quality : Double, var qualityp : Double) : CabelAbstract (type,cablecores,diametr,quality)
{
    override fun Input() {
        try {
            println("Введите начилие оплетки (Да/Нет)")
            if (readln() == "Да")
            {
                qualityp = 2 * quality
            }
            else
            {
                qualityp = 0.7 * quality
            }
        } catch (e: Exception) {
            println("Данные введены неверно")
        }
    }
    override fun Output() {
        println("Ответ - ${qualityp}")
    }
}