package SpockDemo

import spock.lang.Specification;

class ThirdExample extends Specification {
	def " we are going to add two number"(){

		given:
		def obj = new SumOfTwoNymber()
		when: "when we are going to cll adder method"
		def sum =obj.adder(2, 3)
		
		then: sum==5
	}
	
}
