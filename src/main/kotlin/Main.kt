package org.bytebloom

fun priorityValue(priority: Priority): Int {
        return when (priority) {
                Priority.URGENT -> 3
                Priority.STANDARD -> 2
                Priority.LOW -> 1
        }
}

fun compareByPriority(first: Package, second: Package): Boolean {
        val firstPriority = priorityValue(first.priority)
        val secondPriority = priorityValue(second.priority)
        return firstPriority > secondPriority
}

fun compareByWeight(first: Package, second: Package): Boolean {
        return first.weight > second.weight
}

fun isBetter(first: Package, second: Package): Boolean {
        if (first.priority != second.priority) {
                return compareByPriority(first, second)
        }

        return compareByWeight(first, second)
}

fun selectionSortPackages(packages: MutableList<Package>) {
        val listSize = packages.size

        for (i in 0 until listSize - 1) {
                var bestPackageIndex = i

                for (j in i + 1 until listSize) {
                        if (isBetter(packages[j], packages[bestPackageIndex])) {
                                bestPackageIndex = j
                        }
                }

                if (bestPackageIndex != i) {
                        val tempPackage = packages[i]
                        packages[i] = packages[bestPackageIndex]
                        packages[bestPackageIndex] = tempPackage
                }
        }
}

fun main() {
        // Test the CSV reading function
        val loadedPackages = readPackages("packages.csv")
        val packages = readPackages("packages.csv")

        val packagesToSort = loadedPackages.toMutableList()
        selectionSortPackages(packagesToSort)

        // طباعة أفضل 3 طرود للتحقق من صحة الترتيب
        println("\n--- Top 3 Urgent & Heaviest Packages ---")
        val topPackages = packagesToSort.take(3)
        topPackages.forEach { pkg ->
                println("ID: ${pkg.id}, Weight: ${pkg.weight}, Dest: ${pkg.destinationHubId}, Priority: ${pkg.priority}")
        }

}