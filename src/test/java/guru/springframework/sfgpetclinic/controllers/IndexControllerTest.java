package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller=new IndexController();
    }
    @Test
    @DisplayName("Test proper view name is returned for index page")
    void index() {
        assertEquals("index",controller.index());
        assertEquals("index",controller.index(),"Wrong View Returned");
        assertEquals("index",controller.index(),()-> "Another expensive Message "+
                "Make me only if you have to");
    }

    @Test
    @DisplayName("Test exception")
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class,()->{
            controller.oupsHandler();
        });
    }
    @Disabled("Demo of timeout")
    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(100),()->{
            Thread.sleep(5000);
            System.out.println("I got here");
        });
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOutPrempt(){
        assertTimeout(Duration.ofMillis(100),()->{
            Thread.sleep(5000);
            System.out.println("I got here 234567");
        });
    }
    /*
    @Test
    void testAssumptionTrue(){
        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }
     */
    @Test
    void testAssumptionTrueAssumptionTrue(){
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
        System.out.println("Indu");
    }
    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS(){

    }
    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11(){

    }
    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8(){

    }
    @EnabledIfEnvironmentVariable(named="USER",matches="jt")
    @Test
    void testMeOnJava11EnvVar(){

    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void testIndex() {
    }

    @Test
    void testOupsHandler() {
    }
}