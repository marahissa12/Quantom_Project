package org.bytebloom

fun main() {
    val packages = readPackages("packages.csv").toMutableList()

    selectionSortPackagesByPriorityAndWeight(packages)

    printTopPackages(packages, 3)
}