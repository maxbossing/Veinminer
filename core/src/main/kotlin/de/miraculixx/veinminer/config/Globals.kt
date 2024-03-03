package de.miraculixx.veinminer.config

import kotlinx.serialization.json.Json

const val cRed = 0xff5555
const val cGreen = 0x55ff55
const val cBase = 0xaaaaaa

const val permissionToggle = "veinminer.toggle"
const val permissionBlocks = "veinminer.blocks"
const val permissionSettings = "veinminer.settings"

val json = Json {
    prettyPrint = true
    ignoreUnknownKeys = true
}