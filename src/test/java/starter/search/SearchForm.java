package starter.search;

import org.openqa.selenium.By;

public class SearchForm {
    public static By SEARCH_FIELD = By.id("searchbox_input");
    public static By SEARCH_BUTTON = By.cssSelector("button[class*='searchbox_searchButton']");
}
