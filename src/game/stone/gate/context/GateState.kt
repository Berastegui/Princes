package game.stone.gate.context

import game.IState

abstract class GateState(
): IState {
    abstract fun getFullOpenState(): GateState
    abstract fun getOpenState(): GateState
    abstract fun getFullCloseState(): GateState
    abstract fun getCloseState(): GateState
}