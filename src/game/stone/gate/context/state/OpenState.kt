package game.stone.gate.context.state

import game.stone.gate.context.GateState

class OpenState: GateState() {
    override fun getOpenState() = this
    override fun getFullCloseState() = CloseState()

    override fun getFullOpenState() = this

    override fun getCloseState() = MidOpenState()
}