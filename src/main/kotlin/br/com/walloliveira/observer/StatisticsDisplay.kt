package br.com.walloliveira.observer

class StatisticsDisplay(private val observable: Observable) : Observer {
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println("""
            StatisticsDisplay {} 
                temperatura: $temperature
                humidity: $humidity
                pressure: $pressure
        """)
    }

    init {
        this.observable.addObserver(this)
    }
}