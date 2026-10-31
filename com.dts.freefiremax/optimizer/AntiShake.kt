package optimizer

object AntiShake {
    fun apply() {
        exec("settings put system gyro_stabilize 1")
        exec("settings put system shake_filter 100")
        exec("settings put system vibration_aim_cancel 1")
        exec("settings put system aim_shake_reduce 95")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
