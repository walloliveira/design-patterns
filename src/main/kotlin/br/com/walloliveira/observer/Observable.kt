package br.com.walloliveira.observer

interface Observable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
    fun setChanged()
}
