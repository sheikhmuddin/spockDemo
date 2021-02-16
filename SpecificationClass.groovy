package SpockDemo

import spock.lang.*

//SpecificationClass
class SpecificationClass extends Specification{
	//instance fields
	
//	def obj =new SumOfTwoNymber()  //it is rendon obj
	@Shared obj =new SumOfTwoNymber()
	
	def "Feature method one"()
	{
		given:
		obj
	}
	def "Feature method two"()
	{
		given:
		obj
	}
	
	
	
}