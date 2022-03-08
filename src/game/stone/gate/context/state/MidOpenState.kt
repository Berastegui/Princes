package game.stone.gate.context.state

import game.stone.gate.context.GateState

class MidOpenState: GateState() {
    override fun getOpenState() = OpenState()
    override fun getFullCloseState() = CloseState()
    override fun getFullOpenState() = OpenState()
    override fun getCloseState() = CloseState()
}