package io.jenkins.pluginhealth.scoring.probes;



import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.kohsuke.github.GHCommit;



class DefaultBranchBuildStatusProbeTest extends  AbstractProbeTest<DefaultBranchBuildStatusProbe> {

    @Override
    DefaultBranchBuildStatusProbe getSpy() {
        return spy(DefaultBranchBuildStatusProbe.class);
    }

    @Test
    void shouldNotRequireRelease() {
        assertThat(getSpy().requiresRelease()).isFalse();
    }

    @Test
    void shouldBeRelatedToCode() {
        assertThat(getSpy().isSourceCodeRelated()).isTrue();
    }

    @Test
    void shouldVerifyDefaultBranch() throws IOException {

//        final io.jenkins.pluginhealth.scoring.model.Plugin plugin = mock(Plugin.class);
//        final ProbeContext ctx = mock(ProbeContext.class);
//        when(plugin.getName()).thenReturn("foo");
//        when(ctx.getScmRepository()).thenReturn(Optional.empty());
//        GHRepository ghRepository = new GHRepository();
//        ghRepository.setDefaultBranch("main");
            GHCommit ghCommit = new GHCommit();


//


    }

}
