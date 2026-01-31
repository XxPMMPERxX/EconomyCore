package jp.asteria.economy

import cn.nukkit.plugin.PluginBase
import java.util.UUID

class EconomyCore : PluginBase(), IEconomyCore {
    companion object {
        lateinit var instance: EconomyCore
    }

    override fun onLoad() {
        instance = this
    }

    override fun existsAccount(account: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun getBalance(account: UUID): Long {
        TODO("Not yet implemented")
    }

    override fun hasEnoughMoney(account: UUID, amount: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun increaseMoney(player: UUID, amount: Long, reason: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun decreaseMoney(player: UUID, amount: Long, reason: String): Boolean {
        TODO("Not yet implemented")
    }
}
