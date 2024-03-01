
fun main() {
    try {
        var cabel = Cabel("unnamed",0,0.0,0.0)
        var opletka = Opletka(cabel.type,cabel.cablecores,cabel.diametr, cabel.quality,0.0)
        cabel.Input()
        opletka.Input()
        cabel.Output()
        opletka.Output()
    }
    catch (e:Exception)
    {
        println("Данные введены неверно")
    }
}