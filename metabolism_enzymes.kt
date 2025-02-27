private enum class Reaction {
    BUILDING_UP,
    BREAKING_DOWN
}

private enum class EnergyChange {
    ABSORB, 
    RELEASE
}

private enum class Amount {
    SMALL
}

private abstract class Metabolism {
    abstract val reaction: Reaction 
    abstract val energyChange: EnergyChange
}

private class Anabolism: Metabolism() {
    override val reaction = Reaction.BUILDING_UP
    override val energyChange = EnergyChange.ABSORB
}

private class Catabolism: Metabolism() {
    override val reaction = Reaction.BREAKING_DOWN
    override val energyChange = EnergyChange.RELEASE
}

private class Enzymes {
    // enzymes are biological catalysts, providing alternative pathway with lower activation energy
    
    val isUsedUpByReaction = false
    val isChemicallyAlteredByReaction = false
    val isReusable = true
    val amountNeededPerReaction = Amount.SMALL
}

private fun main() {
    println("Fuck biology")
}
