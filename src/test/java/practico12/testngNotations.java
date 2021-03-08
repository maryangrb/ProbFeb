package practico12;

import org.testng.annotations.*;

public class testngNotations {

    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @BeforeMethod //aqui se inicializa el driver
    public void beforeMethod(){
        System.out.println("@BeforeMethod");
    }

    @Test
    public void test1(){
        System.out.println("Ejecutando el test 1");
    }

    @Test
    public void test2(){
        System.out.println("Ejecutando el test 2");
    }

    @AfterMethod //aqui se cierra el driver
    public void afterMethod(){
        System.out.println("@AfterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest");
    }


}
