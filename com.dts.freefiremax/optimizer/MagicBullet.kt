package optimizer

object MagicBullet {
    fun apply() {
        exec("settings put system bullet_speed_multiplier 2")
        exec("settings put system bullet_spread_reduction 95")
        exec("settings put system magic_bullet_enabled 1")
        exec("settings put system hit_predict_ms 0")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
