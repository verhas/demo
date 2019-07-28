package javax0.demo.jpms.annotation;

import javax0.geci.docugen.*;
import javax0.geci.engine.Geci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestCreateDocumentation {

    @Test
    void createArticle() throws IOException {
        final var geci = new Geci();
        int i = 0;
        Assertions.assertFalse(
            geci.source(".").ignore("\\.git", "\\.(png|zip|class|jar|asc|graffle)$", "target")
                .log(Geci.MODIFIED)
                .register(SnippetCollector.builder().phase(i++).build())
                .register(SnippetAppender.builder().phase(i++).build())
                .register(SnippetRegex.builder().phase(i++).build())
                .register(SnippetTrim.builder().phase(i++).build())
                .register(SnippetNumberer.builder().phase(i++).build())
                .register(SnipetLineSkipper.builder().phase(i++).build())
                .register(MarkdownCodeInserter.builder().phase(i++).build())
                .splitHelper("md", new MarkdownSegmentSplitHelper())
                .generate(),
            geci.failed());    }
}
