package Servicio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServicioPruebasTest<driver> {

    private WebDriver driver;
    By convocatoria = By.linkText("Convocatorias");

    @Before
    public void Cargar_primero() throws Exception{
       System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Vergara Sierra\\Desktop\\chromedriver.exe" );
       driver = new ChromeDriver();
       String baseUrl = "https://www.choucairtesting.com/empleos-testing/";
       driver.get(baseUrl);
       driver.manage().window().maximize();
    }

    @After
    public void hacer_despues() throws Exception{
driver.quit();
    }

  @Test
  public void cargar_pagina_principal_portal_Empleado_dar_clic_en_convocatoria(){
    driver.findElement(convocatoria).click();

  }

    @Test
    public void cargar_pagina_principal_portal_Empleado_dar_clic_en_convocatoria_buscar_empleo_por_palabra_clave(){
        driver.findElement(By.name("search_keywords")).sendKeys("Analista");
        driver.findElement(By.className("search_submit")).click();

           }

    @Test
    public void cargar_pagina_principal_portal_Empleado_dar_clic_en_convocatoria_buscar_empleo_por_Localidad_abri_descripcion_oferta(){
        driver.findElement(By.name("search_location")).sendKeys("Bogota");
        driver.findElement(By.className("search_submit")).click();
      //  assertEquals("Analista de Pruebas Medellín y Bogotá", driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[1]/a/div[1]/h3")));
        driver.findElement(By.className("position")).click();

    }


}