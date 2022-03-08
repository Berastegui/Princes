package game.stone.guardian

import game.IState

abstract class GuardianState: IState {
    abstract fun getWarnedState(): GuardianState
}