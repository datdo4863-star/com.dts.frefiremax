package optimizer

object AimLock {
    fun apply() {
        exec("settings put system aim_lock_sensitivity 95")
        exec("settings put system aim_lock_radius 8")
        exec("settings put system aim_lock_speed 100")
        exec("settings put system aim_lock_enabled 1")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
