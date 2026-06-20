package LibraryManagementSystem;

public class Library {

    // Linear search to find a book by its title (case-insensitive)
    public static Book linearSearchByTitle(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary search to find a book by its title (case-insensitive, assuming sorted array)
    public static Book binarySearchByTitle(Book[] books, String targetTitle) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comp = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (comp == 0) {
                return books[mid];
            } else if (comp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
