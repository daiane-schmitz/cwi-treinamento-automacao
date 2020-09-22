package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.CategoryPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
    System.out.println("Abrimos o navegador e carregamos a URL");
    }

    @Test
    public void testLogin(){
        Browser.getCurrentDriver().findElement(By.className("login")).click();
        System.out.println("Clicou em Sign in e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("rrsetcwi+autopractice@gmail.com");
        System.out.println("Preencheu o email");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("teste123");
        System.out.println("Preencheu a senha");
        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        System.out.println("Clicou em Sign in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou url da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou elemento Minha conta no site");
    }

    @Test
    public void testSearch() {

        String quest = "DRESS";
        String questResultQtd = "7 results have been found.";

        //Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        home.doSearch(quest);
        
        //Validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Test
    public void testAcessCategoryTShirts(){
        //Iniciar as páginas
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        //Clicar na categoria T-Shirts
        home.clickCategoryTShirts();

        //Validar se ao clicar na categoria T-Shirts ocorre o direcionamento correto
        assertTrue(category.isPageTShirts());
    }

    @Test
    public void testAddProductToProductPage(){
        //Acessar a categoria T-Shirts
        testAcessCategoryTShirts();

        //Iniciar as páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva nome do produto na página de categoria
        String nameProductCategory = category.getProductNameCategory();

        //Clicar em more e direcionar para a pasta do produto
        category.clickProductAddToProductPage();

        //Verificar se o produto está na página de detalhes do produto
        assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));


    }

}
