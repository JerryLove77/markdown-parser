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
    final String Snippet1Link1 = "`google.com";
    final String Snippet1Link2 = "google.com";
    final String Snippet1Link3 = "ucsd.edu";

    final String Snippet2Link1 = "a.com";
    final String Snippet2Link2 = "a.com(())";
    final String Snippet2Link3 = "example.com";

    final String Snippet3Link1 = "https://www.twitter.com";
    final String Snippet3Link2 = "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule";
    final String Snippet3Link3 = "https://cse.ucsd.edu/";


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

    @Test
    public void MDPTestSnippet1() throws IOException{
        Path snippet1Path = Path.of("TestSnippet1.md");
        String snippet1Content = Files.readString(snippet1Path);
        ArrayList<String> links = MarkdownParse.getLinks(snippet1Content);
        ArrayList<String> result = new ArrayList<String>();
        result.add(Snippet1Link1);
        result.add(Snippet1Link2);
        result.add(Snippet1Link3);
        assertEquals(result, links);
    }

    @Test
    public void MDPTestSnippet2() throws IOException{
        Path snippet2Path = Path.of("TestSnippet2.md");
        String snippet2Content = Files.readString(snippet2Path);
        ArrayList<String> links = MarkdownParse.getLinks(snippet2Content);
        ArrayList<String> result = new ArrayList<String>();
        result.add(Snippet2Link1);
        result.add(Snippet2Link2);
        result.add(Snippet2Link3);
        assertEquals(result, links);
    }

    @Test
    public void MDPTestSnippet3() throws IOException{
        Path snippet3Path = Path.of("TestSnippet3.md");
        String snippet3Content = Files.readString(snippet3Path);
        ArrayList<String> links = MarkdownParse.getLinks(snippet3Content);
        ArrayList<String> result = new ArrayList<String>();
        result.add(Snippet3Link1);
        result.add(Snippet3Link2);
        result.add(Snippet3Link3);
        assertEquals(result, links);
    }
}

