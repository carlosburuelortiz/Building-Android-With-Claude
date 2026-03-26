Write unit tests for: $ARGUMENTS

Test conventions:
* Use mockito-kotlin and JUnit libraries
* All test classes must be annotated with:
  `@RunWith(MockitoJUnitRunner.StrictStubs.class)`
* This annotation must always go **before** the class declaration
* Do not use `MockitoAnnotations.openMocks(this)` in `@Before`, the runner handles it
* Unnecessary mocks are prohibited by the StrictStubs policy
* Install only the libraries that are necessary
* Place test files in a "src/test" directory
* Name test files as [filename]Test.kt
* Test names should be separated by spaces, do not use '_'
* Only the first letter in the sentence describing the test case should be capitalized
* Comments must be in English

Coverage:
* Test both positive and negative cases
