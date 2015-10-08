package org.grails.compiler.injection

import grails.artefact.Artefact
import org.grails.core.artefact.ControllerArtefactHandler
import spock.lang.Specification

/**
 * @author John Wagenleitner
 */
class ArtefactTypeAstTransformationTest extends Specification {

    void 'Artefact using constant expression'() {
        expect:
        new ArtefactTypedTestControllerConstant()
    }

    void 'Artefact using property constant'() {
        expect:
        new ArtefactTypedTestControllerPropertyConstant()
    }
}

@Artefact("Controller")
class ArtefactTypedTestControllerConstant { }

@Artefact(ControllerArtefactHandler.TYPE)
class ArtefactTypedTestControllerPropertyConstant { }