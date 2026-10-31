package optimizer

object HeadTrack {
    fun apply() {
        exec("settings put system head_track_enabled 1")
        exec("settings put system head_hitbox_scale 1.5")
        exec("settings put system head_snap_speed 100")
        exec("settings put system head_priority_aim 1")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
