Undertow HTTP/2 Servlet Example
===============================

Build and run as follows:

```bash
git clone https://github.com/fstab/http2-examples
cd http2-examples/undertow-http2-servlet-example
mvn clean package
java -jar target/undertow-http2-servlet-example.jar
```

Then point an HTTP/2-enabled web browser to [https://localhost:8443/hello-world/api/hello-world](https://localhost:8443/hello-world/api/hello-world)

Notice
------

This example was created using the the _http2_ example and the _servlet_ example in [undertow-io/undertow](https://github.com/undertow-io/undertow/tree/master/examples/src/main/java/io/undertow/examples).

##### Http2PerformenceTest.testHttp2Performence
```bash
# JMH 1.17.4 (released 34 days ago)
# VM version: JDK 1.8.0_45, VM 25.45-b02
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/bin/java
# VM options: -Dfile.encoding=UTF-8
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: microbenchmark.Http2PerformenceTest.testHttp2Performence

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 10
# Warmup Iteration   1: 30.697 ops/s
# Warmup Iteration   2: 66.094 ops/s
# Warmup Iteration   3: 68.026 ops/s
# Warmup Iteration   4: 70.670 ops/s
# Warmup Iteration   5: 70.624 ops/s
# Warmup Iteration   6: 69.588 ops/s
# Warmup Iteration   7: 72.696 ops/s
# Warmup Iteration   8: 72.667 ops/s
# Warmup Iteration   9: 73.466 ops/s
# Warmup Iteration  10: 73.364 ops/s
# Warmup Iteration  11: 74.810 ops/s
# Warmup Iteration  12: 74.035 ops/s
# Warmup Iteration  13: 74.317 ops/s
# Warmup Iteration  14: 74.794 ops/s
# Warmup Iteration  15: 74.482 ops/s
# Warmup Iteration  16: 74.335 ops/s
# Warmup Iteration  17: 75.015 ops/s
# Warmup Iteration  18: 75.134 ops/s
# Warmup Iteration  19: 75.293 ops/s
# Warmup Iteration  20: 75.294 ops/s
Iteration   1: 75.744 ops/s
Iteration   2: 74.971 ops/s
Iteration   3: 75.150 ops/s
Iteration   4: 75.485 ops/s
Iteration   5: 76.654 ops/s
Iteration   6: 76.913 ops/s
Iteration   7: 77.511 ops/s
Iteration   8: 76.536 ops/s
Iteration   9: 76.873 ops/s
Iteration  10: 76.601 ops/s
Iteration  11: 76.130 ops/s
Iteration  12: 77.021 ops/s
Iteration  13: 76.464 ops/s
Iteration  14: 75.696 ops/s
Iteration  15: 73.560 ops/s
Iteration  16: 75.464 ops/s
Iteration  17: 75.501 ops/s
Iteration  18: 75.602 ops/s
Iteration  19: 77.636 ops/s
Iteration  20: 76.984 ops/s

# Run progress: 10.00% complete, ETA 00:06:06
# Fork: 2 of 10
# Warmup Iteration   1: 37.325 ops/s
# Warmup Iteration   2: 65.018 ops/s
# Warmup Iteration   3: 67.440 ops/s
# Warmup Iteration   4: 68.982 ops/s
# Warmup Iteration   5: 70.571 ops/s
# Warmup Iteration   6: 70.245 ops/s
# Warmup Iteration   7: 71.590 ops/s
# Warmup Iteration   8: 71.003 ops/s
# Warmup Iteration   9: 73.800 ops/s
# Warmup Iteration  10: 56.209 ops/s
# Warmup Iteration  11: 74.655 ops/s
# Warmup Iteration  12: 73.908 ops/s
# Warmup Iteration  13: 73.120 ops/s
# Warmup Iteration  14: 75.089 ops/s
# Warmup Iteration  15: 74.521 ops/s
# Warmup Iteration  16: 74.323 ops/s
# Warmup Iteration  17: 74.256 ops/s
# Warmup Iteration  18: 74.214 ops/s
# Warmup Iteration  19: 75.306 ops/s
# Warmup Iteration  20: 74.457 ops/s
Iteration   1: 76.616 ops/s
Iteration   2: 75.455 ops/s
Iteration   3: 75.888 ops/s
Iteration   4: 75.709 ops/s
Iteration   5: 74.027 ops/s
Iteration   6: 72.739 ops/s
Iteration   7: 75.510 ops/s
Iteration   8: 75.986 ops/s
Iteration   9: 71.903 ops/s
Iteration  10: 70.204 ops/s
Iteration  11: 63.288 ops/s
Iteration  12: 73.086 ops/s
Iteration  13: 74.514 ops/s
Iteration  14: 76.538 ops/s
Iteration  15: 76.972 ops/s
Iteration  16: 76.679 ops/s
Iteration  17: 63.385 ops/s
Iteration  18: 76.237 ops/s
Iteration  19: 76.196 ops/s
Iteration  20: 77.155 ops/s

# Run progress: 20.00% complete, ETA 00:05:26
# Fork: 3 of 10
# Warmup Iteration   1: 39.244 ops/s
# Warmup Iteration   2: 68.610 ops/s
# Warmup Iteration   3: 69.268 ops/s
# Warmup Iteration   4: 70.915 ops/s
# Warmup Iteration   5: 71.231 ops/s
# Warmup Iteration   6: 73.114 ops/s
# Warmup Iteration   7: 73.276 ops/s
# Warmup Iteration   8: 73.219 ops/s
# Warmup Iteration   9: 73.675 ops/s
# Warmup Iteration  10: 74.374 ops/s
# Warmup Iteration  11: 73.728 ops/s
# Warmup Iteration  12: 73.752 ops/s
# Warmup Iteration  13: 75.051 ops/s
# Warmup Iteration  14: 74.785 ops/s
# Warmup Iteration  15: 74.353 ops/s
# Warmup Iteration  16: 72.821 ops/s
# Warmup Iteration  17: 70.776 ops/s
# Warmup Iteration  18: 75.134 ops/s
# Warmup Iteration  19: 70.163 ops/s
# Warmup Iteration  20: 72.921 ops/s
Iteration   1: 74.576 ops/s
Iteration   2: 75.721 ops/s
Iteration   3: 24.535 ops/s
Iteration   4: 77.351 ops/s
Iteration   5: 76.247 ops/s
Iteration   6: 77.879 ops/s
Iteration   7: 76.841 ops/s
Iteration   8: 76.890 ops/s
Iteration   9: 76.013 ops/s
Iteration  10: 77.080 ops/s
Iteration  11: 76.621 ops/s
Iteration  12: 76.217 ops/s
Iteration  13: 76.056 ops/s
Iteration  14: 77.087 ops/s
Iteration  15: 77.933 ops/s
Iteration  16: 77.165 ops/s
Iteration  17: 76.848 ops/s
Iteration  18: 76.459 ops/s
Iteration  19: 77.745 ops/s
Iteration  20: 77.410 ops/s

# Run progress: 30.00% complete, ETA 00:04:47
# Fork: 4 of 10
# Warmup Iteration   1: 38.354 ops/s
# Warmup Iteration   2: 67.378 ops/s
# Warmup Iteration   3: 69.431 ops/s
# Warmup Iteration   4: 71.067 ops/s
# Warmup Iteration   5: 70.909 ops/s
# Warmup Iteration   6: 72.010 ops/s
# Warmup Iteration   7: 72.361 ops/s
# Warmup Iteration   8: 73.850 ops/s
# Warmup Iteration   9: 73.855 ops/s
# Warmup Iteration  10: 74.382 ops/s
# Warmup Iteration  11: 73.360 ops/s
# Warmup Iteration  12: 73.927 ops/s
# Warmup Iteration  13: 73.927 ops/s
# Warmup Iteration  14: 73.983 ops/s
# Warmup Iteration  15: 74.144 ops/s
# Warmup Iteration  16: 75.574 ops/s
# Warmup Iteration  17: 76.051 ops/s
# Warmup Iteration  18: 75.253 ops/s
# Warmup Iteration  19: 75.237 ops/s
# Warmup Iteration  20: 75.696 ops/s
Iteration   1: 75.933 ops/s
Iteration   2: 76.160 ops/s
Iteration   3: 76.393 ops/s
Iteration   4: 75.741 ops/s
Iteration   5: 75.913 ops/s
Iteration   6: 78.072 ops/s
Iteration   7: 74.845 ops/s
Iteration   8: 77.018 ops/s
Iteration   9: 72.774 ops/s
Iteration  10: 73.656 ops/s
Iteration  11: 76.504 ops/s
Iteration  12: 76.888 ops/s
Iteration  13: 77.788 ops/s
Iteration  14: 76.589 ops/s
Iteration  15: 75.359 ops/s
Iteration  16: 77.182 ops/s
Iteration  17: 75.222 ops/s
Iteration  18: 76.906 ops/s
Iteration  19: 76.890 ops/s
Iteration  20: 77.538 ops/s

# Run progress: 40.00% complete, ETA 00:04:05
# Fork: 5 of 10
# Warmup Iteration   1: 37.736 ops/s
# Warmup Iteration   2: 67.389 ops/s
# Warmup Iteration   3: 1.314 ops/s
# Warmup Iteration   4: 65.238 ops/s
# Warmup Iteration   5: 68.205 ops/s
# Warmup Iteration   6: 69.463 ops/s
# Warmup Iteration   7: 70.241 ops/s
# Warmup Iteration   8: 72.930 ops/s
# Warmup Iteration   9: 72.906 ops/s
# Warmup Iteration  10: 74.366 ops/s
# Warmup Iteration  11: 74.149 ops/s
# Warmup Iteration  12: 69.718 ops/s
# Warmup Iteration  13: 71.535 ops/s
# Warmup Iteration  14: 71.501 ops/s
# Warmup Iteration  15: 73.936 ops/s
# Warmup Iteration  16: 72.872 ops/s
# Warmup Iteration  17: 73.327 ops/s
# Warmup Iteration  18: 73.980 ops/s
# Warmup Iteration  19: 75.537 ops/s
# Warmup Iteration  20: 74.398 ops/s
Iteration   1: 74.178 ops/s
Iteration   2: 73.477 ops/s
Iteration   3: 74.589 ops/s
Iteration   4: 74.032 ops/s
Iteration   5: 74.430 ops/s
Iteration   6: 75.092 ops/s
Iteration   7: 78.411 ops/s
Iteration   8: 74.948 ops/s
Iteration   9: 77.332 ops/s
Iteration  10: 76.129 ops/s
Iteration  11: 76.218 ops/s
Iteration  12: 78.177 ops/s
Iteration  13: 75.203 ops/s
Iteration  14: 77.703 ops/s
Iteration  15: 75.395 ops/s
Iteration  16: 77.721 ops/s
Iteration  17: 75.911 ops/s
Iteration  18: 78.590 ops/s
Iteration  19: 78.649 ops/s
Iteration  20: 77.016 ops/s

# Run progress: 50.00% complete, ETA 00:03:24
# Fork: 6 of 10
# Warmup Iteration   1: 38.944 ops/s
# Warmup Iteration   2: 69.255 ops/s
# Warmup Iteration   3: 69.084 ops/s
# Warmup Iteration   4: 71.115 ops/s
# Warmup Iteration   5: 70.938 ops/s
# Warmup Iteration   6: 72.486 ops/s
# Warmup Iteration   7: 73.566 ops/s
# Warmup Iteration   8: 70.798 ops/s
# Warmup Iteration   9: 73.426 ops/s
# Warmup Iteration  10: 74.257 ops/s
# Warmup Iteration  11: 73.554 ops/s
# Warmup Iteration  12: 74.312 ops/s
# Warmup Iteration  13: 73.741 ops/s
# Warmup Iteration  14: 76.394 ops/s
# Warmup Iteration  15: 75.797 ops/s
# Warmup Iteration  16: 72.549 ops/s
# Warmup Iteration  17: 72.623 ops/s
# Warmup Iteration  18: 71.248 ops/s
# Warmup Iteration  19: 73.707 ops/s
# Warmup Iteration  20: 76.165 ops/s
Iteration   1: 74.542 ops/s
Iteration   2: 74.704 ops/s
Iteration   3: 77.490 ops/s
Iteration   4: 77.774 ops/s
Iteration   5: 75.432 ops/s
Iteration   6: 78.121 ops/s
Iteration   7: 78.862 ops/s
Iteration   8: 76.509 ops/s
Iteration   9: 78.845 ops/s
Iteration  10: 77.948 ops/s
Iteration  11: 74.880 ops/s
Iteration  12: 78.010 ops/s
Iteration  13: 78.106 ops/s
Iteration  14: 75.555 ops/s
Iteration  15: 77.692 ops/s
Iteration  16: 77.555 ops/s
Iteration  17: 77.105 ops/s
Iteration  18: 78.113 ops/s
Iteration  19: 77.582 ops/s
Iteration  20: 41.000 ops/s

# Run progress: 60.00% complete, ETA 00:02:44
# Fork: 7 of 10
# Warmup Iteration   1: 37.559 ops/s
# Warmup Iteration   2: 66.866 ops/s
# Warmup Iteration   3: 68.116 ops/s
# Warmup Iteration   4: 72.290 ops/s
# Warmup Iteration   5: 68.130 ops/s
# Warmup Iteration   6: 73.025 ops/s
# Warmup Iteration   7: 73.153 ops/s
# Warmup Iteration   8: 71.102 ops/s
# Warmup Iteration   9: 74.555 ops/s
# Warmup Iteration  10: 74.097 ops/s
# Warmup Iteration  11: 73.665 ops/s
# Warmup Iteration  12: 71.930 ops/s
# Warmup Iteration  13: 70.053 ops/s
# Warmup Iteration  14: 74.924 ops/s
# Warmup Iteration  15: 74.799 ops/s
# Warmup Iteration  16: 73.264 ops/s
# Warmup Iteration  17: 75.674 ops/s
# Warmup Iteration  18: 76.407 ops/s
# Warmup Iteration  19: 76.394 ops/s
# Warmup Iteration  20: 73.185 ops/s
Iteration   1: 76.526 ops/s
Iteration   2: 75.698 ops/s
Iteration   3: 76.754 ops/s
Iteration   4: 75.230 ops/s
Iteration   5: 77.259 ops/s
Iteration   6: 77.250 ops/s
Iteration   7: 74.969 ops/s
Iteration   8: 76.831 ops/s
Iteration   9: 76.769 ops/s
Iteration  10: 73.402 ops/s
Iteration  11: 72.854 ops/s
Iteration  12: 75.878 ops/s
Iteration  13: 77.672 ops/s
Iteration  14: 76.703 ops/s
Iteration  15: 78.185 ops/s
Iteration  16: 74.425 ops/s
Iteration  17: 75.684 ops/s
Iteration  18: 77.866 ops/s
Iteration  19: 77.828 ops/s
Iteration  20: 75.134 ops/s

# Run progress: 70.00% complete, ETA 00:02:03
# Fork: 8 of 10
# Warmup Iteration   1: 36.580 ops/s
# Warmup Iteration   2: 66.211 ops/s
# Warmup Iteration   3: 70.243 ops/s
# Warmup Iteration   4: 71.686 ops/s
# Warmup Iteration   5: 68.119 ops/s
# Warmup Iteration   6: 72.071 ops/s
# Warmup Iteration   7: 70.455 ops/s
# Warmup Iteration   8: 73.607 ops/s
# Warmup Iteration   9: 74.723 ops/s
# Warmup Iteration  10: 71.505 ops/s
# Warmup Iteration  11: 73.903 ops/s
# Warmup Iteration  12: 74.337 ops/s
# Warmup Iteration  13: 71.534 ops/s
# Warmup Iteration  14: 66.455 ops/s
# Warmup Iteration  15: 75.462 ops/s
# Warmup Iteration  16: 74.016 ops/s
# Warmup Iteration  17: 73.510 ops/s
# Warmup Iteration  18: 70.975 ops/s
# Warmup Iteration  19: 71.942 ops/s
# Warmup Iteration  20: 73.635 ops/s
Iteration   1: 76.506 ops/s
Iteration   2: 75.380 ops/s
Iteration   3: 75.568 ops/s
Iteration   4: 71.565 ops/s
Iteration   5: 74.620 ops/s
Iteration   6: 74.459 ops/s
Iteration   7: 77.497 ops/s
Iteration   8: 77.297 ops/s
Iteration   9: 74.820 ops/s
Iteration  10: 76.903 ops/s
Iteration  11: 75.842 ops/s
Iteration  12: 76.732 ops/s
Iteration  13: 71.249 ops/s
Iteration  14: 77.313 ops/s
Iteration  15: 76.097 ops/s
Iteration  16: 77.109 ops/s
Iteration  17: 78.778 ops/s
Iteration  18: 75.416 ops/s
Iteration  19: 77.716 ops/s
Iteration  20: 77.322 ops/s

# Run progress: 80.00% complete, ETA 00:01:21
# Fork: 9 of 10
# Warmup Iteration   1: 37.784 ops/s
# Warmup Iteration   2: 66.927 ops/s
# Warmup Iteration   3: 69.057 ops/s
# Warmup Iteration   4: 67.234 ops/s
# Warmup Iteration   5: 70.582 ops/s
# Warmup Iteration   6: 72.887 ops/s
# Warmup Iteration   7: 72.482 ops/s
# Warmup Iteration   8: 71.686 ops/s
# Warmup Iteration   9: 72.429 ops/s
# Warmup Iteration  10: 70.026 ops/s
# Warmup Iteration  11: 72.481 ops/s
# Warmup Iteration  12: 70.202 ops/s
# Warmup Iteration  13: 66.690 ops/s
# Warmup Iteration  14: 68.631 ops/s
# Warmup Iteration  15: 71.036 ops/s
# Warmup Iteration  16: 74.724 ops/s
# Warmup Iteration  17: 77.649 ops/s
# Warmup Iteration  18: 75.534 ops/s
# Warmup Iteration  19: 76.474 ops/s
# Warmup Iteration  20: 75.109 ops/s
Iteration   1: 12.782 ops/s
Iteration   2: 76.858 ops/s
Iteration   3: 77.286 ops/s
Iteration   4: 76.746 ops/s
Iteration   5: 78.373 ops/s
Iteration   6: 77.391 ops/s
Iteration   7: 72.996 ops/s
Iteration   8: 77.596 ops/s
Iteration   9: 77.996 ops/s
Iteration  10: 78.194 ops/s
Iteration  11: 76.989 ops/s
Iteration  12: 76.073 ops/s
Iteration  13: 75.760 ops/s
Iteration  14: 79.866 ops/s
Iteration  15: 76.186 ops/s
Iteration  16: 77.637 ops/s
Iteration  17: 78.216 ops/s
Iteration  18: 72.340 ops/s
Iteration  19: 59.053 ops/s
Iteration  20: 67.298 ops/s

# Run progress: 90.00% complete, ETA 00:00:41
# Fork: 10 of 10
# Warmup Iteration   1: 19.835 ops/s
# Warmup Iteration   2: 56.839 ops/s
# Warmup Iteration   3: 62.557 ops/s
# Warmup Iteration   4: 62.952 ops/s
# Warmup Iteration   5: 43.665 ops/s
# Warmup Iteration   6: 58.348 ops/s
# Warmup Iteration   7: 61.383 ops/s
# Warmup Iteration   8: 69.268 ops/s
# Warmup Iteration   9: 69.608 ops/s
# Warmup Iteration  10: 69.446 ops/s
# Warmup Iteration  11: 73.512 ops/s
# Warmup Iteration  12: 73.026 ops/s
# Warmup Iteration  13: 59.375 ops/s
# Warmup Iteration  14: 50.299 ops/s
# Warmup Iteration  15: 69.791 ops/s
# Warmup Iteration  16: 71.912 ops/s
# Warmup Iteration  17: 74.158 ops/s
# Warmup Iteration  18: 75.127 ops/s
# Warmup Iteration  19: 75.987 ops/s
# Warmup Iteration  20: 70.448 ops/s
Iteration   1: 71.928 ops/s
Iteration   2: 73.406 ops/s
Iteration   3: 72.142 ops/s
Iteration   4: 73.422 ops/s
Iteration   5: 74.115 ops/s
Iteration   6: 72.340 ops/s
Iteration   7: 71.293 ops/s
Iteration   8: 69.673 ops/s
Iteration   9: 75.906 ops/s
Iteration  10: 75.642 ops/s
Iteration  11: 72.165 ops/s
Iteration  12: 68.104 ops/s
Iteration  13: 75.698 ops/s
Iteration  14: 73.053 ops/s
Iteration  15: 73.321 ops/s
Iteration  16: 76.624 ops/s
Iteration  17: 76.024 ops/s
Iteration  18: 75.746 ops/s
Iteration  19: 60.506 ops/s
Iteration  20: 73.393 ops/s


Result "microbenchmark.Http2PerformenceTest.testHttp2Performence":
  74.884 ±(99.9%) 1.607 ops/s [Average]
  (min, avg, max) = (12.782, 74.884, 79.866), stdev = 6.805
  CI (99.9%): [73.277, 76.492] (assumes normal distribution)


# Run complete. Total time: 00:06:51

Benchmark                                   Mode  Cnt   Score   Error  Units
Http2PerformenceTest.testHttp2Performence  thrpt  200  74.884 ± 1.607  ops/s



```
