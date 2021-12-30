package io.michaelhdesigns.dashkit

import fr.cryptohash.*
import io.michaelhdesigns.bitcoincore.core.IHasher
import java.util.*

class X25XHasher : IHasher {
    private val algorithms = listOf(
            BLAKE(),
            BMW(),
            Groestl(),
            Skein(),
            JH(),
            Keccak(),
            Luffa(),
            CubeHash(),
            SHAvite(),
            SIMD(),
            ECHO(),
            Hamsi(),
            Fugue(),
            SHAbal(),
            Whirlpool(),
            SHA2(),
            Haval(),
            Tiger(),
            Panama(),
            Blake2s(),
            Lane(),
            Gost_Streebog(),
            Lyra2(),
            SWIFFTX()
    )

    override fun hash(data: ByteArray): ByteArray {
        var hash = data

        algorithms.forEach {
            hash = it.digest(hash)
        }

        return hash.copyOfRange(0, 32)
    }
}
