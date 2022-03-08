package game.stone.gate

import game.stone.IAction

class CloseGate(
    private val gate: GateContext
): IAction {
    override fun exec() {
        gate.close()
    }
}