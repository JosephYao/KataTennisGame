package tennisgame;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestTennisGameWithoutDeuce.class,
	TestTennisGameWithDeuce.class,
	TestTennisGameErrorHandlingWithoutDeuce.class,
	TestTennisGameErrorHandlingWithDeuce.class
})
public class AllTests {

}
