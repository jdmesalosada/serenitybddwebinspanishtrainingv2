package starter.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewData {

    /**
     * Factory: write different Questions about the Menu or principal interface
     */


    public static Question<String> creditAvailable() {
        return actor -> TextContent.of(FinancialOverview.CREDIT_AVAILABLE).viewedBy(actor).asString().trim();
    }

    public static Question<String> totalBalance(){
        return actor -> TextContent.of(FinancialOverview.TOTAL_BALANCE).viewedBy(actor).asString().trim();
    }
}
