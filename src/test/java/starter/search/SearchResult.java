package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

public class SearchResult {
    public static Question<Collection<String>> titles() {
        return Text.ofEach(SearchResultList.RESULT_TITLES).describedAs("the results displayed");
    }
}
