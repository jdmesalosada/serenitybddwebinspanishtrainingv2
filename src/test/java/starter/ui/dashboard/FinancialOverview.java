package starter.dashboard;

import org.openqa.selenium.By;

public class FinancialOverview {

    public static By CREDIT_AVAILABLE = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
    public static By TOTAL_BALANCE = By.xpath("//div[contains(text(),'Total Balance')]/following-sibling::div[@class='balance-value']");


}
