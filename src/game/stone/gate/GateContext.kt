package game.stone.gate

import game.IContext
import game.stone.gate.context.GateState
import game.stone.gate.context.state.OpenState

abstract class GateContext(
    private val name: String
): IContext {

    private var state: GateState = OpenState()

    protected fun fullyOpen () {
        state = state.getFullOpenState()
    }
    protected fun fullyClose() {
        state = state.getFullCloseState()
    }
    protected fun partiallyOpen() {
        state = state.getOpenState()
    }
    protected fun partiallyClose() {
        state = state.getCloseState()
    }
    abstract fun open()
    abstract fun close()
    override fun getName(): String = name

    override fun getState() = state.getName()
}