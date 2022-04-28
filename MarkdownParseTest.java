//import packages for using Junit Test
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.*;
//creating a testing class
public class MarkdownParseTest {
    @Test
    //creating a method to use Junit test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testFileMDTest() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        assertEquals(List.of("https://something.com", "some-thing.html"),obj.getLinks(content));
    }
    @Test
    public void testFile2MDTest() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        assertEquals(List.of("https://something.com", "some-page.html"),obj.getLinks(content) );
    }
    @Test
    public void testFileMD3Test() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        ArrayList<String> temp = new ArrayList<>();
        assertEquals(temp,obj.getLinks(content));
    }
    
    @Test
    public void infiniteLoopMDTest() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/infiniteLoopMDTest.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        assertEquals(List.of("https://something.com","some-thing.html"),obj.getLinks(content));
    }
    
    @Test
    public void testFileMD4Test() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        assertEquals(List.of("google.com"),obj.getLinks(content));
    }

    @Test
    public void testFileMD5Test() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        ArrayList<String> temp = new ArrayList<>();
        assertEquals(temp,obj.getLinks(content));
    }

    @Test
    public void testFileMD6Test() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        ArrayList<String> temp = new ArrayList<>();
        assertEquals(temp,obj.getLinks(content));
    }
    @Test
    public void testFileMD7Test() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        ArrayList<String> temp = new ArrayList<>();
        assertEquals(temp,obj.getLinks(content));
    }
    @Test
    public void testFileMD8Test() throws IOException{
        Path fileName = Path.of("C:/Users/Zhang/Documents/GitHub/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        MarkdownParse obj = new MarkdownParse();
        assertEquals(List.of("a link on the first line"),obj.getLinks(content));
    }

}

