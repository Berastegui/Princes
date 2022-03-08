package game.stone

class Stone {
    private val actions: MutableList<IAction> = mutableListOf()

    fun addAction(action: IAction) = actions.add(action)

    fun exec() = actions.forEach { it.exec() }


}