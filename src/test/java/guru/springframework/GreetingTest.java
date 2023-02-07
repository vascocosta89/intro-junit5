package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll: called once before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("beforeEach: called before each test");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld1() {
        System.out.println(greeting.helloWorld("joe"));

    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("ben"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("afterEach: called after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll: called once after all tests");

    }
}