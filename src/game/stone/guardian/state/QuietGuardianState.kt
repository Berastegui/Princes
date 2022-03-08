package game.stone.guardian.state

import game.stone.guardian.GuardianState

class QuietGuardianState: GuardianState() {
    override fun getWarnedState() = WarnedGuardianState()
}