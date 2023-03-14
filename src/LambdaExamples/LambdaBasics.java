package LambdaExamples;

@FunctionalInterface
 interface sum2
{
	public void add(int a ,int b);
}

//over here we have a situation where a class is created solely for the purpose of implementing 
//add functionality of functional interface .In such case wouldn't it be more feasible to have it 
//implemented with anonymous inner class or using lambda expression.. see Driver.java class
public class LambdaBasics implements sum2 {
@Override
public void add(int a , int b) {
	
System.out.println(a+b);

}
}
