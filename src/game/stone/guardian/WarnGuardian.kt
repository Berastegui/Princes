package game.stone.guardian

import game.stone.IAction

class WarnGuardian(
    private val guardian: Guardian
): IAction {
    override fun exec() {
        guardian.warn()
    }
}