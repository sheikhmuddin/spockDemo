package SpockDemo

import spock.lang.Specification

class firstTest extends Specification{
	def "we are going to seee max calue using mathclass"(){
		expect:
		Math.max(3,5)==5
	}
}
