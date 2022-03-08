package game.stone.gate.context.state

import game.stone.gate.context.GateState

class CloseState: GateState() {
    override fun getOpenState() = MidOpenState()
    override fun getFullCloseState() = this

    override fun getFullOpenState() = OpenState()

    override fun getCloseState() = this
}