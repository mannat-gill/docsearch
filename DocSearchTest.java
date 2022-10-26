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
    URI rootPath = new URI("http://localhost:5555");
    assertEquals("There are 1391 total files to search", h.handleRequest(rootPath));
	}
    
/*
	@Test 
	public void testSearch() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost:5555/search?q=MESSAGE OF THE BOARD OF DIRECTORS");
    String expect ="There are 1 files found";
    expect += "\n./technical/government/About_LSC/Comments_on_semiannual.txt";
    assertEquals(expect, h.handleRequest(rootPath));
	}
    */
  
}
