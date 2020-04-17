package br.com.walloliveira.observer

import kotlin.random.Random

class WeatherData() : Observable {
    private var temperature: Float
    private var humidity: Float
    private var pressure: Float
    private var displays: MutableList<Observer>

    init {
        this.humidity = 0f
        this.temperature = 0f
        this.pressure = 0f
        this.displays = mutableListOf()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        this.notifyObservers()
    }

    override fun addObserver(observer: Observer) {
        this.displays.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        this.displays.remove(observer)
    }

    override fun notifyObservers() {
        this.displays.forEach {
            it.update(this.temperature, this.humidity, this.pressure)
        }
    }

    override fun setChanged() {
        setMeasurements(Random.nextFloat(), Random.nextFloat(), Random.nextFloat())
    }
}