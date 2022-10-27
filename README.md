This is a Maven SpringBoot project. No Spring framework knowledge is needed in the implementation. Import the project to your dev environment.
We have tested this with IntelliJ, Eclipse and Visual Studio Code. In IntelliJ use function 'New Project from existing sources' and select the pom.xml. 
In Eclipse use function 'Import Existing Maven projects' and select the project root folder. In Visual Studio Code use function 'Open folder' and select 
the project root folder. Using some other tool is ok. Use Java 8 or newer.

Project has service ResultDb that provides method getResults that can be used to get the best 3DMark Fire Strike or Time Spy results ordered by the score in descending order.
Each result is an instance of HallOfFameResult class having fields user, score, rank and gpu count.

We would like to have the following changes implemented in the service:
-A new method for adding a result (giving user, score and gpu count) to the list stored in the ResultDb. This method needs to calculate the rank for the new result and 
update the rank for the existing results. Take care that the updated list is sorted by the score in descending order. The method returns the updated list.  
-Method needs to check for data validity (the only conditions are that user must be non-null and not empty, score must be > 0, gpuCount a value from 1 to 4) and 
fail if the conditions are not met. No need to check if the result already exists in the list.
-Several clients can use the service so we need to take care that once a client has requested a list the content it has does not change by the actions of other clients. 
Existing code can be changed if needed. 
-Method should tell what it does by printing out some lines for debugging purposes.

Test the new functionality by implementing the two unit tests in ProgrammingTestApplicationTests.java
-add a new Fire Strike result for 'Mr Onion' with score 59500 using 4 gpus. Check in the test case that the result is in the resultdb and the rank is correct, it 
should be the fifth best result.
-add an invalid result with a zero score or some other invalid value and check that the operation fails

Adding new dependencies to the project is allowed. Return the contents of the project folder.