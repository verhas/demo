package javax0.blog;

import javax0.jamal.DocumentConverter;
import org.junit.jupiter.api.Test;

public class TestMakeArticle {
    @Test
    void convertMavenPluginReadme() throws Exception {
        DocumentConverter.convert("ARTICLE.wp.jam");
    }
}
