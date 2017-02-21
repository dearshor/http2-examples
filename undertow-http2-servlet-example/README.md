Undertow HTTP/2 Servlet Example
===============================

Build and run the Undertow server as follows:

```bash
git clone https://github.com/fstab/http2-examples
cd http2-examples/undertow-http2-servlet-example
mvn clean package
java -jar target/undertow-http2-servlet-example.jar
```

Then point an HTTP/2-enabled web browser to [https://localhost:8443/hello-world/api/hello-world](https://localhost:8443/hello-world/api/hello-world)

Then we run our benchmark test:
* for convenience we will run jmh benchmark test in IDEA;
* we need this [idea plugin](https://github.com/artyushov/idea-jmh-plugin);
  * First of all, you must have ```jmh-core``` and ```jmh-generator-annprocess``` on the classpath of your module.
  * After that install the plugin. You can do this directly from IDEA — search for `JMH` in plugin repositories.
  * Then you can use the plugin the same way you use JUnit. To generate a new benchmark method run ```Generate...``` action. In Mac OS it is ```Ctrl + N```
  Or just right click in your editor pane and select ```Generate micro benchmark```.
  * To run a separate benchmark method move the cursor to the method declaration and invoke ```Run``` action.
  In Mac OS it is ```Ctrl + Shift + F10```.
  Do the same actions to run all the benchmarks in a class, just move your cursor to the class declaration.


Notice
------

This example was created using the the _http2_ example and the _servlet_ example in [undertow-io/undertow](https://github.com/undertow-io/undertow/tree/master/examples/src/main/java/io/undertow/examples).

#### Test Result
##### Use HTTP2 SERVER
```bash
Result "microbenchmark.Http2PerformenceTest.testHttp2Performence":
  74.884 ±(99.9%) 1.607 ops/s [Average]
  (min, avg, max) = (12.782, 74.884, 79.866), stdev = 6.805
  CI (99.9%): [73.277, 76.492] (assumes normal distribution)


# Run complete. Total time: 00:06:51

Benchmark                                   Mode  Cnt   Score   Error  Units
Http2PerformenceTest.testHttp2Performence  thrpt  200  74.884 ± 1.607  ops/s
```

##### Use HTTP1 SERVER
```bash
Result "microbenchmark.Http2PerformenceTest.testHttp2Performence":
  75.926 ±(99.9%) 0.518 ops/s [Average]
  (min, avg, max) = (59.870, 75.926, 79.356), stdev = 2.194
  CI (99.9%): [75.408, 76.444] (assumes normal distribution)


# Run complete. Total time: 00:06:46

Benchmark                                   Mode  Cnt   Score   Error  Units
Http2PerformenceTest.testHttp2Performence  thrpt  200  75.926 ± 0.518  ops/s
```
