import com.ispeakbetter.pages.ContactPage;
import com.ispeakbetter.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactSD {
    @Given("I am on the Home page for Contact Page")
    public void HomePage() {
        String expectedTitle= "Ücretsiz ders alın.Canlı,bire bir İngilizce dersleri. ISpeakBetter";
        Assert.assertEquals(HelperMethods.doGetPageTitle(),expectedTitle);
    }
    @When("I click Contact page")
    public void clickContactP(){
        ContactPage.clickContactPage();
    }
    @Then("Check Contact page verify url")
    public void title(){
        String expectedURL = "https://ispeakbetter.com/contact";
        Assert.assertEquals(expectedURL, ContactPage.verifyURL());
    }

    @Given("I go the Contact page")
    public void ContactPage(){
        ContactPage.clickContactPage();
    }
    @When("Input your name")
    public void inputYourName() {
        ContactPage.inputName("Test");
    }
    @And("input your email address")
    public void inputYourEmailAddress() {
        ContactPage.inputEmail("test01234@gmail.com");
    }
    @And("Select subject")
    public void selectSubject() {
        ContactPage.selectSubj();
    }
    @And("Input your message")
    public void inputYourMessage() {
        ContactPage.inputMessage("I am checking from contact us message section for test");
    }
    @Then("I click Contact us button")
    public void clickContactUsButton() {
        ContactPage.clickContactUsBtn();
    }

    @Given("I am on the Contact page")
    public void iAmOnTheContactPage() {
        ContactPage.clickContactPage();
    }

    @When("I go all the way to the {string} section")
    public void goScrollUpSection() {
        ContactPage.scrollDown();
    }

    @Then("I click scroll up")
    public void clickScrollUp() {
        ContactPage.scrollUp();
    }

    @Given("I am on the Home page for Chat")
    public void HomePageForChat() {
        String expectedTitle= "Learn English with Online Teachers - Get your Free Live English Class Now.";
        Assert.assertEquals(HelperMethods.doGetPageTitle(),expectedTitle);
    }

    @When("I click Chat button")
    public void ClickChatBtn() {
        ContactPage.clickChatBtn();
    }

    @And("Find frame for Chat section")
    public void findFrame() {
        ContactPage.framePart();
    }

    @And("Input your name in chat")
    public void inputYourNameInChat() {
        ContactPage.inputChatName("Test");
    }

    @And("Input your email address in chat")
    public void inputYourEmailInChat() {
        ContactPage.inputChatEmail("test01234@gmail.com");
    }

    @And("Type your message in chat")
    public void typeYourMessage() {
        ContactPage.inputChatMessage("I am checking from chat section for test ");
    }

    @Then("I click start chat")
    public void clickStartChat() {
        ContactPage.clickStartChat();
    }

    @Given("I am on the Home page for Language menu")
    public void homePageForLanguageMenu() {
        String expectedTitle= "Learn English with Online Teachers - Get your Free Live English Class Now.";
        Assert.assertEquals(HelperMethods.doGetPageTitle(),expectedTitle);
    }

    @When("I click Language part")
    public void clickLanguage() {
        ContactPage.clickLanguageMenu();
    }

    @Then("I select any language")
    public void selectLanguage() {
        ContactPage.clickSelectLanguage();
    }
}
