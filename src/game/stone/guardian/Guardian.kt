package game.stone.guardian

import game.IContext
import game.stone.guardian.state.QuietGuardianState

class Guardian(
    private val name: String
): IContext {

    private var state: GuardianState = QuietGuardianState()

    fun warn() {
        this.state = state.getWarnedState()
    }

    override fun getName(): String = name

    override fun getState() = state.getName()
}