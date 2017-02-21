package microbenchmark;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by dearshor on 2017/2/21.
 */
public class Http2PerformenceTest {

    @Benchmark
    public void testHttp2Performence() throws IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {

        SSLContextBuilder builder = new SSLContextBuilder();
        builder.loadTrustMaterial(null, new TrustSelfSignedStrategy()); // trust self signed cert
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                builder.build());
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        HttpGet httpGet = new HttpGet("https://localhost:8443/hello-world/api/hello-world");

        try (final CloseableHttpResponse response = httpClient.execute(httpGet);
             /*final InputStream contentStream = response.getEntity().getContent()*/) {
            // commented code bellow will cause too much out
            /*ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int n ;

            byte[] buf = new byte[4096];
            while ((n = contentStream.read()) > -1) {
                baos.write(buf, 0, n);
            }
            System.out.println();
            System.out.write(baos.toByteArray());
            System.out.println();*/
            EntityUtils.consume(response.getEntity());
        }



    }
}
