package optimizer

object AimHead {
    fun apply() {
        exec("settings put system aimhead_pull_strength 95")
        exec("settings put system aimhead_lock_radius 5")
        exec("settings put system aimhead_snap_enabled 1")
        exec("settings put system aimhead_new_drag 1")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
