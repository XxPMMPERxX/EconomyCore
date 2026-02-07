package jp.asteria.economy

import cn.nukkit.plugin.PluginBase
import java.util.*

/**
 * 経済管理プラグイン
 *
 * プレイヤーの所持金を管理
 */
class EconomyCore : PluginBase(), IEconomyCore {
    companion object {
        lateinit var instance: EconomyCore
            private set
    }

    override fun onLoad() {
        instance = this
    }

    /**
     * 金額をフォーマット
     */
    fun formatMoney(amount: Long): String {
        return "${"%,d".format(amount)}円"
    }

    override fun existsAccount(account: UUID): Boolean {
        return true
    }

    override fun getBalance(account: UUID): Long {
        return 0
    }

    override fun hasEnoughMoney(account: UUID, amount: Long): Boolean {
        return true
    }

    override fun increaseMoney(player: UUID, amount: Long, reason: String): Boolean {
        return true
    }

    override fun decreaseMoney(player: UUID, amount: Long, reason: String): Boolean {
        return true
    }
}
