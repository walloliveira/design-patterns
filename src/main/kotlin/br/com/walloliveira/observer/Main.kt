package br.com.walloliveira.observer

fun main() {
    val weatherData = WeatherData()
    val display1 = GeneralDisplay(weatherData)
    val display2 = StatisticsDisplay(weatherData)
    weatherData.setMeasurements(
            temperature = 10f,
            humidity = 20f,
            pressure = 30f
    )
    weatherData.setChanged()
    weatherData.setChanged()
}