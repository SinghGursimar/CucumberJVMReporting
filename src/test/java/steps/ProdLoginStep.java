package steps;
import io.cucumber.java.en.And;

public class ProdLoginStep {
	
	@And("user validates the capcha")
	public void user_validates_the_capcha() {
		System.out.println("@And -- user validates the capcha");
		System.out.println("OK OK OK");
	}

}
