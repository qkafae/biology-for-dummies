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

private enum class EnzymeStatus {
    ENZYME,
    ENZYME_SUBSTRATE
}

private abstract class Metabolism {
    abstract val reaction: Reaction 
    abstract val energyChange: EnergyChange
}

private abstract class Protein {
    abstract val name: String
}

private abstract class Molecule {
    abstract val name: String
}

private class Substrate: Molecule() {
    override val name = "substrate"
}

private class Anabolism: Metabolism() {
    override val reaction = Reaction.BUILDING_UP
    override val energyChange = EnergyChange.ABSORB
}

private class Catabolism: Metabolism() {
    override val reaction = Reaction.BREAKING_DOWN
    override val energyChange = EnergyChange.RELEASE
}

private class Enzyme: Protein() {
    // enzymes are biological catalysts, providing alternative pathway with lower activation energy
    
    override val name = "enzyme"
    
    val isUsedUpByReaction = false
    val isChemicallyAlteredByReaction = false
    val isReusable = true
    val amountNeededPerReaction = Amount.SMALL
    
    fun start() {
        val activeSites: Array<Substrate?> = arrayOf(null, null)
        
        var type = EnzymeStatus.ENZYME
        
        Thread.sleep(1000)
        
        for (i in activeSites.indices) {
            activeSites[i] = Substrate()
        }
        
        type = EnzymeStatus.ENZYME_SUBSTRATE
        
        Thread.sleep(1000)
        
        for (i in activeSites.indices) {
            activeSites[i] = null
        } 
        
        type = EnzymeStatus.ENZYME
    }
}

private fun main() {
    println("Fuck biology")
}
