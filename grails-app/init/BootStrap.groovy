import weblogic12withgrails314test.TestDomain

class BootStrap {

    def init = { servletContext ->
		System.out.println("In BootStrap")
		new TestDomain(testProperty: 'Initialized from BootStrap.groovy').save(flush: true)
    }
    def destroy = {
    }
}
