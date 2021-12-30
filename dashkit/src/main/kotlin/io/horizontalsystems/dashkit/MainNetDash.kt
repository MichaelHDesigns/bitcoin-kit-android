package io.horizontalsystems.dashkit

import io.horizontalsystems.bitcoincore.network.Network

class MainNetDash : Network() {

    override val protocolVersion = 70214
    override val noBloomVersion = 70201

    override var port: Int = 65000

    override var magic: Long = 0xeeaeeacc
    override var bip32HeaderPub: Int = 0x0488B21E   // The 4 byte header that serializes in base58 to "xpub".
    override var bip32HeaderPriv: Int = 0x0488ADE4  // The 4 byte header that serializes in base58 to "xprv"
    override var addressVersion: Int = 100
    override var addressSegwitHrp: String = "h"
    override var addressScriptVersion: Int = 40
    override var coinType: Int = 231

    override val maxBlockSize = 1_000_000
    override val dustRelayTxFee = 1000 // https://github.com/dashpay/dash/blob/master/src/policy/policy.h#L36

    override var dnsSeeds = listOf(
            "73.150.182.108",
            "155.138.198.71",
            "62.171.128.133"
    )
}
