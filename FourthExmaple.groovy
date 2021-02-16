package SpockDemo

import spock.lang.Specification;

class FourthExmaple extends Specification {
	
	def "Feature metho wiout explicit block"(){
		setup:
		def a= 5
		def b =6
		def obj =new SumOfTwoNymber()
		when:
		def sum = obj.adder(a, b)
		
		then:
		sum==11
		
		when:
		def list=[]
		list.add(3)
		list.add(4)
		
		println list.get(5)
		
		then:
		thrown(IndexOutOfBoundsException)
		println "Finally we have thrwon the excption"
		list.size()==2
		
		expect:
		Math.max(2, 3)==3
		
		cleanup:
		println "we are line"
		
	}
}
