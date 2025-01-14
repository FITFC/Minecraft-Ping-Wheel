package nx.pingwheel.client

import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vector4f
import java.util.UUID

data class PingData(
	var pos: Vec3d,
	val uuid: UUID?,
	var spawnTime: Int,
	var aliveTime: Int? = null,
	var screenPos: Vector4f? = null,
)
