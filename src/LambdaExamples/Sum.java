package LambdaExamples;

//we have a functional interface whose primary work is to provide an abstract method
//add for addition operation
@FunctionalInterface
public interface Sum {

	public void add(int a , int b ,int c);
}
