package game

interface IState {
    fun getName(): String = this.javaClass.name
}