package game.stone.gate

import game.stone.IAction

class OpenGate(
    private val gate: GateContext
): IAction {
    override fun exec() {
        gate.open()
    }
}