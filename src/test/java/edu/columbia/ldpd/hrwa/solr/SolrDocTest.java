package edu.columbia.ldpd.hrwa.solr;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.marc4j.marc.Record;

import edu.columbia.ldpd.hrwa.clio.SolrDoc;
import edu.columbia.ldpd.hrwa.marc.z3950.MARCFetcher;


public class SolrDocTest {
    private static Record marc8540838;
    private static Record marc8540895;

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();
    File solrDir;
    File marcDir;
    
    @Before
    public void setUp() throws IOException{
        solrDir = temp.newFolder("solr");
        marcDir = temp.newFolder("marc");
    }
    
    @After
    public void tearDown() {
    	if (solrDir != null) solrDir.delete();
    	if (marcDir != null) marcDir.delete();
    }

    @Test
    public void testCollectionSource() throws IOException {
        InputStream eis = FacetFieldTest.class.getResourceAsStream("/8540838.solr.xml");
        InputStream marc = FacetFieldTest.class.getResourceAsStream("/8540838.marc.xml");
        File aFile = new SolrDoc(marc).serialize(solrDir);
        InputStream ais = new FileInputStream(aFile);
        String actual = readString(ais);
        String expected = readString(eis);
        assertEquals(actual, expected);
    }

    @Test
    public void testIntegration() throws IOException {
        InputStream eis = FacetFieldTest.class.getResourceAsStream("/8540895.solr.xml");
        MARCFetcher fetcher = new MARCFetcher(marcDir);
        fetcher.fetch(1,1007,"8540895");
        InputStream marc = new FileInputStream(new File(marcDir,"8540895.xml"));
        File aFile = new SolrDoc(marc).serialize(solrDir);
        InputStream ais = new FileInputStream(aFile);
        String actual = readString(ais);
        String expected = readString(eis);
        assertEquals(actual + "\n**WAS NOT EQUAL TO:**\n" + expected, actual, expected);
    }

    private String readString(InputStream in) throws IOException {
        StringBuffer result = new StringBuffer();
        InputStreamReader rdr = new InputStreamReader(in);
        char [] buf = new char[256];
        int len = 0;
        while ((len = rdr.read(buf)) > -1){
            result.append(buf,0,len);
        }
        in.close();
        return result.toString();
    }

}
