package EcommerceSearch;

public class SearchAlgorithms {

    // Linear Search: finds a product by ID in an unsorted array
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product != null && product.getProductId().equals(targetId)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search: finds a product by ID in a sorted array
    public static Product binarySearch(Product[] products, String targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = products[mid].getProductId().compareTo(targetId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Not found
    }
}
