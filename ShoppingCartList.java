import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartList extends BasePage {

    public ShoppingCartList(WebDriver driver){
        super(driver);
    }

    By imageLabel = By.linkText("Image");
    By productNameLabel = By.linkText("Product Name");
    By modelLabel = By.linkText("Model");
    By quantityLabel = By.linkText("Quantity");
    By unitPriceLabel = By.linkText("Unit Price");
    By totalLabel = By.linkText("Total");
    By image = By.className("img-thumbnail");
    String productName = driver.findElement(By.className("text-left")).getText();

    public void isVisibleElement() {
        ShoppingCartList shoppingCartList = new ShoppingCartList(driver);
    }

}
