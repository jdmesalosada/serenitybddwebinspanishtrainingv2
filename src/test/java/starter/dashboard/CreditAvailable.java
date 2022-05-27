package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CreditAvailable implements Question<String> {

    //una manera para obtener el valor de respuesta a la pregunta
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverview.CREDIT_AVAILABLE).getText();
    }

    //otra manera
    public static Question<String> value(){
        return new CreditAvailable();
    }

}
