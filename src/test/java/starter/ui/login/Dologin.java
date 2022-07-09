package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.InstrumentedTask;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Dologin implements Task {

    private final String username;
    private final String pass;

    public Dologin(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public static Performable withCredentials(String username, String pass){
        return instrumented(Dologin.class, username,pass); //clase para que serenity genere el reporte
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        //---INTERACTIONS
        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(pass).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        );
    }
}
