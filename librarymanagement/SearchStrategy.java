package librarymanagement;

import java.util.Collection;
import java.util.List;

interface SearchStrategy {
        List<Book> search(Collection<Book> books, String keyword);

}
