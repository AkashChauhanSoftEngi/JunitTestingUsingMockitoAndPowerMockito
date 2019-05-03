# JunitTestingUsingMockitoAndPowerMockito

## Questions/Answers
* What is Mockito?
  - Mockito is mocking frame work for Java Objects.
* Why do we need to Mock Objects?
  - When an unit of code depended upon object that will not be available during test or development. We can create a mock object of it.
* What is Mock Object?
  - A mock object[proxy] is a dummy implementation for an interface or a class in which you define the output of certain method calls

## Mockito limitations/Solution
* Mokito has its own major limitations like we cannot test Static methods
* Using PowerMock with Mockito will solve limitations of Mokito, even testing of Static methods is possible
* Mokito is a kind of subset to PowerMock
  
  
## Aditional Details  
* Need to add these jars
  - Junit
  - Mockito

* Ways to create a mock objects
  - 1. Annotation Based: @Mock, and later use initMocks(this);
  - 2. SampleClass = mock(SampleClass.class)
  
* Functionalities mockito provides
  - 1. when(...).thenReturn(...);
  - 2. when(...).thenThrow(Exception.class);
  - 3. verify(mocked object).method(eq(1), eq(2));
    - to verify if a partucular method is called or not with particular parameters
    - 3.1. verify(obj, times(1)).method(1,2);

* When you make a class, like "~Test", during project building all such classes will run Automatically unless one
  - check skip test check box, or
  - maven command {-Dmaven.test.skip=true}
* To run directly only the test cases: the use mvn test
* Reference: https://www.youtube.com/watch?v=79eXGJ2rKZs

## Junit Annotations
* @BeforeClass – Run just once before any of the test methods in the class, public static void
* @AfterClass – Run just once after all the tests completion in the class, public static void
* @Before – Run before each @Test, public void {each method}
* @After – Run after each @Test, public void {each method}
* @Ignore - to ignore this test case
* @Test – This is the test method to run, public void
* JUnit Assert Class
  - Reference :https://www.guru99.com/junit-annotations-api.html
 
* How to mock a static call?
  - By using PowerMockito
    - Use of @RunWith(PowerMockRunner.class), @PrepareForTest(StaticMethodClass.class)
	- mockStatic(StaticMethodClass.class);
  - Reference: https://examples.javacodegeeks.com/core-java/powermockito/powermock-mock-static-method-example/
  - Supported versions
	- Reference: https://github.com/powermock/powermock/wiki/Mockito#supported-versions
* @SuitClasses and @RunWith(Suit.class)
  - https://www.youtube.com/watch?v=7XBd6psCV9g
