fun ternarySearch(arr: IntArray, left: Int, right: Int, target: Int): Int {
    if (right >= left) {
        val mid1 = left + (right - left) / 3
        val mid2 = right - (right - left) / 3

        if (arr[mid1] == target) {
            return mid1
        }

        if (arr[mid2] == target) {
            return mid2
        }

        if (target < arr[mid1]) {
            return ternarySearch(arr, left, mid1 - 1, target)
        } else if (target > arr[mid2]) {
            return ternarySearch(arr, mid2 + 1, right, target)
        } else {
            return ternarySearch(arr, mid1 + 1, mid2 - 1, target)
        }
    }
    return -1
}
