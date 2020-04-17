package br.com.walloliveira.observer

class GeneralDisplay(private val observable: Observable) : Observer {
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println("""
            GeneraDisplay {} 
                temperatura: $temperature
                humidity: $humidity
                pressure: $pressure
        """)
    }

    init {
        this.observable.addObserver(this)
    }
}
