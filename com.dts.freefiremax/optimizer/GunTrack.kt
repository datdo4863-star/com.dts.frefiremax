package optimizer

object GunTrack {
    fun apply() {
        exec("settings put system gun_track_enabled 1")
        exec("settings put system gun_stick_sensitivity 100")
        exec("settings put system gun_auto_follow 1")
        exec("settings put system gun_target_lock 95")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
