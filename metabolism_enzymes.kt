enum class Reaction {
    BUILDING_UP,
    BREAKING_DOWN
}

enum class EnergyChange {
    ABSORB, 
    RELEASE
}

enum class Amount {
    SMALL
}

abstract class Metabolism {
    abstract val reaction: Reaction 
    abstract val energyChange: EnergyChange
}

class Anabolism: Metabolism() {
    override val reaction = Reaction.BUILDING_UP
    override val energyChange = EnergyChange.ABSORB
}

class Catabolism: Metabolism() {
    override val reaction = Reaction.BREAKING_DOWN
    override val energyChange = EnergyChange.RELEASE
}

class Enzymes {
    // enzymes are biological catalysts, providing alternative pathway with lower activation energy
    
    val isUsedUpByReaction = false
    val isChemicallyAlteredByReaction = false
    val isReusable = true
    val amountNeededPerReaction = Amount.SMALL
}

private fun main() {
    println("Fuck biology")
}
