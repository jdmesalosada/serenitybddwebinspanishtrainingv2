package starter.search;

import org.openqa.selenium.By;

public class SearchForm {
    public static By SEARCH_FIELD = By.xpath("//input[contains(@id, 'search_form_input_homepage') or contains(@id, 'searchbox_input')]");
    public static By SEARCH_BUTTON = By.xpath("(//input[contains(@id,'search_button_homepage')] | //button[contains(@class, 'search')])");
}
