import java.util.Scanner

class ProductRequirements {
    fun chooseProduct() { // This function is like main, meaning it calls most other functions.
        println("Welcome to the Satisfactory Directory!")
        val prodCat = chooseProductCategory()
        // Item code will be in #0# format, i.e. 402, meaning category 4, item 2.
        val itemCode = "${prodCat}0${displayProducts(prodCat)}"
        getInfo(itemCode)
    }

    private fun getInfo(itemCode: String) {
        val itemInfo = ItemInfo()
        itemInfo.getInfo(itemCode)
    }

    private fun displayProducts(prodCat: Int): Int { // Searches the Items class and displays the right category.
        println("\nPlease choose an item:")
        val itemList = Items()
        var sum = 0
        for ((key, value) in itemList.categories) {
            if (key == prodCat) {
                for ((K, V) in value) {
                    println("$K = $V")
                    sum++
                }
            }
        }
        print("> ")
        val reader = Scanner(System.`in`)
        var integerIn: Int = reader.nextInt()
        while (integerIn < 1 || integerIn > sum) {
            println("Please choose an item identifier within range:")
            print("> ")
            integerIn = reader.nextInt()
        }
        return integerIn
    }

    private fun chooseQuantity() { // Goal in items per minute.
        return
    }

    private fun chooseProductCategory(): Int {
        println(
            "Please choose an item category:\n" +
                    "1  - Ores\n" +
                    "2  - Ingots\n" +
                    "3  - Minerals\n" +
                    "4  - Fluids\n" +
                    "5  - Standard Parts\n" +
                    "6  - Industrial Parts\n" +
                    "7  - Electronics\n" +
                    "8  - Communications\n" +
                    "9  - Containers\n" +
                    "10 - Fuels\n" +
                    "11 - Consumed\n" +
                    "12 - Nuclear\n" +
                    "13 - Waste\n" +
                    "14 - Special"
        )
        print("> ")
        val reader = Scanner(System.`in`)
        var integerIn: Int = reader.nextInt()
        while (integerIn < 1 || integerIn > 14) {
            println("Please choose a category identifier within range:")
            print("> ")
            integerIn = reader.nextInt()
        }
        return integerIn
    }
}

class MachinesNeeded(item: String, quantity: Int) {
    fun machineIn() { // how many items per minute to input.
        return
    }

    fun machineOut() { // how many items per minute to output.
        return
    }

    fun getMachineName(machineInt: Int) { // machine name and value.
        return
    }

    fun extractionMachines(num: Int): String? {
        val extractionMachinesList = mapOf(
            1 to "Miner Mk. 1",
            2 to "Miner Mk. 2",
            3 to "Miner Mk. 3",
            4 to "Oil Extractor",
            5 to "Water Extractor",
            6 to "Resource Well Pressurizer",
            7 to "Resource Well Extractor"
        )
        return extractionMachinesList[num]
    }

    fun productionMachines(num: Int): String? {
        val productionMachinesList = mapOf(
            1 to "Smelter",
            2 to "Foundry",
            3 to "Constructor",
            4 to "Assembler",
            5 to "Manufacturer",
            6 to "Refinery",
            7 to "Packager",
            8 to "Blender",
            9 to "Particle Accelerator"
        )
        return productionMachinesList[num]
    }

    fun generatorMachines(num: Int): String? {
        val generatorMachinesList = mapOf(
            1 to "Biomass Burner",
            2 to "Coal Generator",
            3 to "Fuel Generator",
            4 to "Geothermal Generator",
            5 to "Nuclear Power Plant",
            6 to "Power Storage"
        )
        return generatorMachinesList[num]
    }
}

class ItemInfo {
    fun getInfo(itemCode: String) {
        val limestone = listOf(
            "Limestone",    // Name
            100,            // Stack Size
            2,              // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val ironOre = listOf(
            "Iron Ore",     // Name
            100,            // Stack Size
            1,              // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val copperOre = listOf(
            "Copper Ore",   // Name
            100,            // Stack Size
            3,              // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val cateriumOre = listOf(
            "Caterium Ore", // Name
            100,            // Stack Size
            7,              // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val coal = listOf(
            "Coal",         // Name
            100,            // Stack Size
            3,              // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val rawQuartz = listOf(
            "Raw Quartz",   // Name
            100,            // Stack Size
            15,             // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val sulfur = listOf(
            "Sulfur",       // Name
            100,            // Stack Size
            11,             // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val bauxite = listOf(
            "Bauxite",      // Name
            100,            // Stack Size
            8,              // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val uranium = listOf(
            "Uranium",      // Name
            100,            // Stack Size
            35,             // Resource Sink Value
            "Miner",        // Machine Used
            30,             // Default Quantity Produced (/min)
            0,              // Quantity of Alternate Recipes
            null,           // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val ironIngot = listOf(
            "Iron Ingot",   // Name
            100,            // Stack Size
            2,              // Resource Sink Value
            "Smelter",      // Machine Used
            30,             // Default Quantity Produced (/min)
            2,              // Quantity of Alternate Recipes
            "Iron Ore",     // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )
        val copperIngot = listOf(
            "Copper Ingot", // Name
            100,            // Stack Size
            6,              // Resource Sink Value
            "Smelter",      // Machine Used
            30,             // Default Quantity Produced (/min)
            2,              // Quantity of Alternate Recipes
            "Copper Ore",   // Item required to craft
            null,           // Item required to craft
            null,           // Item required to craft
            null            // Item required to craft
        )

        when (itemCode) {
            "101" -> displayInfo(limestone)
            "102" -> displayInfo(ironOre)
            "103" -> displayInfo(copperOre)
            "104" -> displayInfo(cateriumOre)
            "105" -> displayInfo(coal)
            "106" -> displayInfo(rawQuartz)
            "107" -> displayInfo(sulfur)
            "108" -> displayInfo(bauxite)
            "109" -> displayInfo(uranium)
            "201" -> displayInfo(ironIngot)
            "202" -> displayInfo(copperIngot)
        }
    }

    private fun displayInfo(list: List<Any?>) {
        println(
            "\nItem Name:             ${list[0]}\n" +
                    "Stack Size:            ${list[1]}\n" +
                    "Resource Sink Value:   ${list[2]}\n" +
                    "Made in:               ${list[3]}\n" +
                    "Qty Produced:          ${list[4]}\n" +
                    "Alternate Recipes:     ${list[5]}\n"
        )
        for (i in 6..9) {
            if (list[i] != null) {
                println("Item Used:             ${list[i]}\n")
            }
        }
    }
}

class Recipes {
    fun hasRecipe(itemCode: String): Boolean {
        return if (itemCode[0] == '1') {
            false
        } else if (itemCode == "401" ||
            itemCode == "402" ||
            itemCode == "4010" ||
            itemCode == "802" ||
            itemCode == "806"
        ) {
            false
        } else if (itemCode[0] == '1' &&
            itemCode[1] == '0' &&
            itemCode[3] < '5'
        ) {
            false
        } else !(itemCode[0] == '1' &&
                itemCode[2] == '4' &&
                itemCode[3] < '4')
    }
}

class AltRecipes

class Items {
    private val oresList = mapOf(
        1 to "Limestone",       // 101
        2 to "Iron Ore",        // 102
        3 to "Copper Ore",      // 103
        4 to "Caterium Ore",    // 104
        5 to "Coal",            // 105
        6 to "Raw Quartz",      // 106
        7 to "Sulfur",          // 107
        8 to "Bauxite",         // 108
        9 to "Uranium"          // 109
    )
    private val ingotsList = mapOf(
        1 to "Iron Ingot",      // 201
        2 to "Copper Ingot",    // 202
        3 to "Caterium Ingot",  // 203
        4 to "Steel Ingot",     // 204
        5 to "Aluminum Ingot"   // 205
    )
    private val mineralsList = mapOf(
        1 to "Concrete",        // 301
        2 to "Quartz Crystal",  // 302
        3 to "Silica",          // 303
        4 to "Copper Powder",   // 304
        5 to "Polymer Resin",   // 305
        6 to "Petroleum Coke",  // 306
        7 to "Aluminum Scrap"   // 307
    )
    private val fluidsList = mapOf(
        1 to "Water",
        2 to "Crude Oil",
        3 to "Heavy Oil Residue",
        4 to "Fuel",
        5 to "Liquid Biofuel",
        6 to "Turbofuel",
        7 to "Alumina Solution",
        8 to "Sulfuric Acid",
        9 to "Nitric Acid",
        10 to "Nitrogen Gas"
    )
    private val standardPartsList = mapOf(
        1 to "Iron Rod",
        2 to "Screw",
        3 to "Iron Plate",
        4 to "Reinforced Iron Plate",
        5 to "Copper Sheet",
        6 to "Alclad Aluminum Sheet",
        7 to "Aluminum Casing",
        8 to "Steel Pipe",
        9 to "Steel Beam",
        10 to "Encased Industrial Beam",
        11 to "Modular Frame",
        12 to "Heavy Modular Frame",
        13 to "Fused Modular Frame",
        14 to "Fabric",
        15 to "Plastic",
        16 to "Rubber"
    )
    private val industrialPartsList = mapOf(
        1 to "Rotor",
        2 to "Stator",
        3 to "Battery",
        4 to "Motor",
        5 to "Heat Sink",
        6 to "Cooling System",
        7 to "Turbo Motor"
    )
    private val electronicsList = mapOf(
        1 to "Wire",
        2 to "Cable",
        3 to "Quickwire",
        4 to "Circuit Board",
        5 to "AI Limiter",
        6 to "High-Speed Connector"
    )
    private val communicationsList = mapOf(
        1 to "Computer",
        2 to "Supercomputer",
        3 to "Quantum Computer",
        4 to "Radio Control Unit",
        5 to "Crystal Oscillator",
        6 to "Superposition Oscillator"
    )
    private val containersList = mapOf(
        1 to "Empty Canister",
        2 to "Empty Fluid Tank",
        3 to "Pressure Conversion Cube",
        4 to "Packaged Water",
        5 to "Packaged Alumina Solution",
        6 to "Packaged Sulfuric Acid",
        7 to "Packaged Nitric Acid",
        8 to "Packaged Nitrogen Gas"
    )
    private val fuelsList = mapOf(
        1 to "Leaves",
        2 to "Mycelia",
        3 to "Flower Petals",
        4 to "Wood",
        5 to "Biomass",
        6 to "Compacted Coal",
        7 to "Packaged Oil",
        8 to "Packaged Heavy Oil Residue",
        9 to "Solid Biofuel",
        10 to "Packaged Fuel",
        11 to "Packaged Liquid Biofuel",
        12 to "Packaged Turbofuel",
        13 to "Uranium Fuel Rod",
        14 to "Plutonium Fuel Rod"
    )
    private val consumedList = mapOf(
        1 to "Black Powder",
        2 to "Nobelisk",
        3 to "Gas Filter",
        4 to "Color Cartridge",
        5 to "Rifle Cartridge",
        6 to "Spiked Rebar",
        7 to "Beacon",
        8 to "Iodine Infused Filter"
    )
    private val nuclearList = mapOf(
        1 to "Electromagnetic Control Rod",
        2 to "Encased Uranium Cell",
        3 to "Non-fissile Uranium",
        4 to "Plutonium Pellet",
        5 to "Encased Plutonium Cell"
    )
    private val wasteList = mapOf(
        1 to "Uranium Waste",
        2 to "Plutonium Waste"
    )
    private val specialList = mapOf(
        1 to "Blue Power Slug",
        2 to "Yellow Power Slug",
        3 to "Purple Power Slug",
        4 to "Power Shard",
        5 to "FICSIT Coupon",
        6 to "Smart Plating",
        7 to "Versatile Framework",
        8 to "Automated Wiring",
        9 to "Modular Engine",
        10 to "Adaptive Control Unit",
        11 to "Assembly Director System",
        12 to "Magnetic Field Generator",
        13 to "Thermal Propulsion Rocket",
        14 to "Nuclear Pasta"
    )

    val categories = mapOf(
        1 to oresList,
        2 to ingotsList,
        3 to mineralsList,
        4 to fluidsList,
        5 to standardPartsList,
        6 to industrialPartsList,
        7 to electronicsList,
        8 to communicationsList,
        9 to containersList,
        10 to fuelsList,
        11 to consumedList,
        12 to nuclearList,
        13 to wasteList,
        14 to specialList
    )
}

fun main() {
    val run = ProductRequirements()
    run.chooseProduct()
}