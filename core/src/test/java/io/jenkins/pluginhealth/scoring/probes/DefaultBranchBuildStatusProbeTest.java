package io.jenkins.pluginhealth.scoring.probes;

import static org.mockito.Mockito.spy;

class DefaultBranchBuildStatusProbeTest extends  AbstractProbeTest<DefaultBranchBuildStatusProbe> {

    @Override
    DefaultBranchBuildStatusProbe getSpy() {
        return spy(DefaultBranchBuildStatusProbe.class);
    }

}
