package Tasks;

import PageObjects.IndexPage;
import org.openqa.selenium.WebDriver;

public class IndexTask {

    private static WebDriver driver;
    private static IndexPage indexPage;


    public IndexTask(WebDriver driver) {
        this.driver = driver;
        indexPage = new IndexPage(this.driver);
    }

    public void selectProduct(){
        indexPage.getLinkProductName().click();
    }

    public void addProductCart(){
        indexPage.getButtonAddCart().click();
    }
}
