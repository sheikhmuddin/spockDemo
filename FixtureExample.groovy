package SpockDemo
import spock.lang.Specification;

class FixtureExample extends Specification{
	def setupSpec() {
		println " we are in setup spec"
	}
	
	def setup() {
		println "Weare is setup fixture"
	}
	def "feature method one"() {
		given:
		println "Weare is setup feature method one"
	}
	
	def "feature method second"() {
		given:
		println "Weare is setup feature method second"
	}
	
	def "feature method 3"() {
		given:
		println "Weare is setup feature method 3"
	}
	def cleanup() {
		println "we are in cleanup method "
	}
	def cleanupSpec() {
		println "We are in clean up spec"
	}
}
