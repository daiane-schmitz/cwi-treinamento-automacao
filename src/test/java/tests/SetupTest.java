package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

@Feature("Testes site de ecommerce")
public class SetupTest extends BaseTests {

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }

    @Test
    @Story("Realizar o login")
    public void testLogin() {
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("Clicou em Sign in e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu o email");

        login.fillPasswd();
        System.out.println("Preencheu a senha");

        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sign in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou url da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou elemento Minha conta no site");
    }

    @Test
    @Story("Teste de busca")
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
    @Story("Acessar a categoria")
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
    @Story("Acessar página de detalhes do produto")
    public void testAddProductToProductPage(){
        //Acessar a categoria T-Shirts
        testAcessCategoryTShirts();

        //Iniciar as páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva nome do produto na página de categoria
        String productNameCategory = category.getProductNameCategory();

        //Clicar em more e direcionar para a pasta do produto
        category.clickProductAddToProductPage();

        //Verificar se o produto está na página de detalhes do produto
        assertTrue(pdp.getProductNamePDP().equals(productNameCategory));

    }

    @Test
    @Story("Adicionar produto ao carrinho")
    public void testAddProductToCart(){
        //Acessa a página do produto
        testAddProductToProductPage();

        //Iniciar as páginas
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();

        //Salvar o nome do produto na página de PDP
        String productNamePDP = pdp.getProductNamePDP();

        //Clicar no botão de adicionar ao carrinho
        pdp.clickButtonAddToCart();

        //Clicar no botão de proceder com o checkout na modal
        pdp.clickButtonProceedToCheckoutModal();

        //Validar nome do produto no carrinho
        assertTrue(cart.getProductNameCart().equals(productNamePDP));

    }


    @Test
    public void testCreateAccount(){
        //Abrir a página
        testOpeningBrowserAndLoadingPage();

        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        RegisterPage register = new RegisterPage();

        home.clickBtnLogin();
        System.out.println("Clicou em Sign in e direcionou para a página de login para criar a conta");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmailCreateAcc();
        System.out.println("Preencheu o e-mail para criar a conta");
        login.clickBtnCreateAccount();
        System.out.println("Clicou em Create a Account");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("http://automationpractice.com/index.php?controller=authentication"));
        System.out.println("Validou que está na página de criar conta");

        //Selecionar o gênero
        register.selectGenderFemale();

        //Preencher o nome
        register.fillFirstName();

        //Preencher o sobrenome
        register.fillLastName();

        //Preencher a senha
        register.fillPasswd();

        //Selecionar aniversário
        register.selectDayBirth();
        register.selectMonthBirth();
        register.selectYearBirth();

        //Selecionar checkbox para receber newsletter
        register.selectSignUpForNewsletter();

        //Selecionar checkbox para receber ofertas
        register.selectReceiveSpecialOffers();

        //Preencher o endereço
        register.fillAddress();

        //Preencher a cidade
        register.fillCity();

        //Selecionar o estado
        register.selectState();

        //Preencher o cep
        register.fillPostcode();

        //Selecionar o país
        register.selectCountry();

        //Preencher informações adicionais
        register.fillAdditionalInformation();

        //Preencher o celular
        register.fillPhoneMobile();

        //Clicar em Register
        register.clickBtnRegister();

        //Validar quee está na página My Account
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("http://automationpractice.com/index.php?controller=my-account"));

    }

}
