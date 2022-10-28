import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class DocSearchTest {
 
    
    @Test 
	public void testIndex() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical");
    URI rootPath = new URI("http://localhost/");
    assertEquals("There are 1392 files to search", h.handleRequest(rootPath));
	}

	@Test 
	public void testSearch() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/search?q=counting%20deaths");
    String expect ="There were 1 files found:";
    expect += "\n./technical/biomed/1468-6708-3-4.txt";
    assertEquals(expect, h.handleRequest(rootPath));
	}

	
  
}
