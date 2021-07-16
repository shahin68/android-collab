package com.kotlin.test

open class Machine(private val wheel: Wheel): MachineFuel, MachineDoor {
    private val fuel: Int = 60
    private var velocity: Int = 10

    override fun fuel_alert() {
        if (fuel < 50){
            print("Turn on Check fuel LED")
        }
    }

    override fun turn_on_light() {
        print("Turn on Light")
    }

    override fun play_beep() {
        print("Play Beep sound")
    }

    private fun set_wheel_size(new_size: Int){
        wheel.size = new_size
    }

    private fun set_wheel_brand(new_brand: String){
        wheel.brand = new_brand
    }

    fun get_velocity(): Int {
        return velocity
    }

    fun set_velocity(new_velocity: Int){
        velocity = new_velocity
    }


}

class Person: Machine(Wheel(1, "A")), PersonAction{
    override fun push_brake() {
        set_velocity(get_velocity() - 1)
    }

    override fun push_accelerator() {
        set_velocity(get_velocity() + 1)
    }

}


data class Wheel(var size: Int=2, var brand:String = "A")

interface PersonAction {
    fun push_brake()
    fun push_accelerator()
}


interface MachineFuel {
    fun fuel_alert()
}

interface MachineDoor {
    fun turn_on_light()
    fun play_beep()
}